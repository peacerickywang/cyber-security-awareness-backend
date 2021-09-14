package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.modelVo.PostVo;
import com.example.cybersecurityawareness.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "Quiz API")
@RestController
@RequestMapping("api")
public class QuizController extends BaseController {
    @Resource
    QuestionService questionService;

    @ApiOperation("Generate New Quiz")
    @RequestMapping(value = {"/quiz/new"}, method = RequestMethod.GET)
    public JSONObject generateNewQuiz() {
        return null;
    }
}
