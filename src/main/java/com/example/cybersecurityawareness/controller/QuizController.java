package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.Utils.Constant;
import com.example.cybersecurityawareness.model.*;
import com.example.cybersecurityawareness.modelVo.QuestionVo;
import com.example.cybersecurityawareness.modelVo.QuizVo;
import com.example.cybersecurityawareness.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@Api(tags = "Quiz API")
@RestController
@RequestMapping("api")
public class QuizController extends BaseController {
    @Resource
    QuestionService questionService;
    @Resource
    QuizService quizService;
    @Resource
    UserService userService;
    @Resource
    TopicService topicService;
    @Resource
    QuizStatisticService quizStatisticService;

    @ApiOperation("Generate New Quiz")
    @RequestMapping(value = {"/quiz/generate"}, method = RequestMethod.GET)
    public JSONObject generateNewQuiz() {
        QuizVo quizVo = new QuizVo();
        String email = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        User user = userService.selectUserByEmail(email);
        Quiz quiz = new Quiz();
        quiz.setUserId(user.getId());
        quiz.setCreatetime(new Date());
        quiz.setTotalQuestion(Constant.TRUE_OR_FALSE_NUMBER+Constant.MULTIPLE_NUMBER);
        quizService.insertSelective(quiz);

        quizVo.setId(quiz.getId());
        quizVo.setTotalQuestion(quiz.getTotalQuestion());
        quizVo.setCreatetime(quiz.getCreatetime());
        quizVo.setUserId(user.getId());
        List<QuestionVo> trueOrFalse = questionService.randomQuestionByType(Constant.questionTypeMap.get(Constant.TRUE_OR_FALSE), Constant.TRUE_OR_FALSE_NUMBER);
        List<QuestionVo> multiple = questionService.randomQuestionByType(Constant.questionTypeMap.get(Constant.MULTIPLE), Constant.MULTIPLE_NUMBER);
        quizVo.setMultiple(multiple);
        quizVo.setTrueOrFalse(trueOrFalse);
        return requestResponse(true, quizVo);
    }

    @ApiOperation("Generate New Quiz (no answer and explaination)")
    @RequestMapping(value = {"/quiz/simple/generate"}, method = RequestMethod.GET)
    public JSONObject generateNewSimpleQuiz() {
        String email = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        User user = userService.selectUserByEmail(email);
        Quiz quiz = new Quiz();
        quiz.setUserId(user.getId());
        quiz.setCreatetime(new Date());
        quiz.setTotalQuestion(Constant.TRUE_OR_FALSE_NUMBER+Constant.MULTIPLE_NUMBER);
        quizService.insertSelective(quiz);
        QuizVo quizVo = new QuizVo();
        quizVo.setId(quiz.getId());
        quizVo.setTotalQuestion(quiz.getTotalQuestion());
        quizVo.setCreatetime(quiz.getCreatetime());
        quizVo.setUserId(user.getId());
        List<QuestionVo> trueOrFalse = questionService.randomSimpleQuestionByType(Constant.questionTypeMap.get(Constant.TRUE_OR_FALSE), Constant.TRUE_OR_FALSE_NUMBER);
        List<QuestionVo> multiple = questionService.randomSimpleQuestionByType(Constant.questionTypeMap.get(Constant.MULTIPLE), Constant.MULTIPLE_NUMBER);
        quizVo.setMultiple(multiple);
        quizVo.setTrueOrFalse(trueOrFalse);
        return requestResponse(true, quizVo);
    }

    @ApiOperation("Mark Quiz")
    @RequestMapping(value = {"/quiz/mark"}, method = RequestMethod.POST)
    @Transactional
    public JSONObject markQuiz(@RequestBody QuizVo quizVo) {
        Quiz quiz = quizService.selectByPrimaryKey(quizVo.getId());
        quiz.setCompletetime(new Date());
        long duration = quiz.getCompletetime().getTime() - quiz.getCreatetime().getTime();
        quiz.setDuration(String.valueOf(duration));
        List<QuestionVo> wrongQuestions = new ArrayList<>();
        /**
         * quiz statistic
         */
        List<Topic> topicList = topicService.selectAll();
        Map<Integer, QuizStatistic> quizStatisticsMap = new HashMap();
        for (Topic topic : topicList) {
            QuizStatistic quizStatistic = new QuizStatistic();
            quizStatistic.setQuizId(quizVo.getId());
            quizStatistic.setTopicId(topic.getId());
            quizStatisticsMap.put(topic.getId(), quizStatistic);
        }
        /**
         * marking quiz
         */
        int true_count = 0;
        for (QuestionVo questionVo : quizVo.getTrueOrFalseResult()) {
            Question questionResult = questionService.selectByPrimaryKey(questionVo.getId());
            QuizStatistic quizStatistic = quizStatisticsMap.get(questionVo.getTopicId());
            quizStatistic.setTotalCount(quizStatistic.getTotalCount()+1);
            if (!questionVo.getUser_answer().equalsIgnoreCase(questionResult.getAnswer())){
                QuestionVo wrongQuestion = questionService.selectVoByPrimaryKey(questionVo.getId());
                wrongQuestion.setUser_answer(questionVo.getUser_answer());
                wrongQuestions.add(wrongQuestion);
            }else {
                quizStatistic.setTrueCount(quizStatistic.getTrueCount()+1);
                true_count++;
            }
            /**
             * updated quiz statistics map
             */
            quizStatisticsMap.put(questionVo.getTopicId(), quizStatistic);
        }
        for (QuestionVo questionVo : quizVo.getMultipleResult()) {
            Question questionResult = questionService.selectByPrimaryKey(questionVo.getId());
            QuizStatistic quizStatistic = quizStatisticsMap.get(questionVo.getTopicId());
            quizStatistic.setTotalCount(quizStatistic.getTotalCount()+1);
            if (!questionVo.getUser_answer().equalsIgnoreCase(questionResult.getAnswer())){
                QuestionVo wrongQuestion = questionService.selectVoByPrimaryKey(questionVo.getId());
                wrongQuestion.setUser_answer(questionVo.getUser_answer());
                wrongQuestions.add(wrongQuestion);
            }else {
                quizStatistic.setTrueCount(quizStatistic.getTrueCount()+1);
                true_count++;
            }
            /**
             * updated quiz statistics map
             */
            quizStatisticsMap.put(questionVo.getTopicId(), quizStatistic);
        }
        List<QuizStatistic> quizStatisticList = new ArrayList<>();
        for (Integer topicId : quizStatisticsMap.keySet()) {
            QuizStatistic quizStatistic = quizStatisticsMap.get(topicId);
            quizStatisticService.insertSelective(quizStatistic);
            quizStatisticList.add(quizStatistic);
        }
        quiz.setTrueQuestion(true_count);
        quizService.updateByPrimaryKeySelective(quiz);
        QuizVo quizVoResponse = quizService.selectVoByPrimaryKey(quizVo.getId());
        quizVoResponse.setWrongAnswer(wrongQuestions);
        return requestResponse(true, quizVoResponse);
    }

    @ApiOperation("Query Answer by QuestionId")
    @RequestMapping(value = {"/quiz/question/answer"}, method = RequestMethod.GET)
    public JSONObject queryQuestionAnswer(@RequestParam int questionId) {
        QuestionVo questionVo = questionService.selectVoByPrimaryKey(questionId);
        return requestResponse(true, questionVo);
    }

    @ApiOperation("Query Quiz by User")
    @RequestMapping(value = {"/quiz/user"}, method = RequestMethod.GET)
    public JSONObject queryQuizByUser() {
        String email = String.valueOf(SecurityUtils.getSubject().getPrincipal());
        User user = userService.selectUserByEmail(email);
        List<QuizVo> quizVoList = quizService.selectVoByUserId(user.getId());
        return requestResponse(true, quizVoList);
    }

    @ApiOperation("Query Quiz Detail by Id")
    @RequestMapping(value = {"/quiz/detail"}, method = RequestMethod.GET)
    public JSONObject queryQuizDetailById(@RequestParam int quizId) {
        QuizVo quizVo = quizService.selectVoByPrimaryKey(quizId);
        return requestResponse(true, quizVo);
    }
}
