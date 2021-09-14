package com.example.cybersecurityawareness.modelVo;

import com.example.cybersecurityawareness.model.Quiz;
import com.example.cybersecurityawareness.model.QuizStatistic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@ApiModel(value = "`QuizVo`")
@Data
public class QuizVo extends Quiz {
    int mark;
    List<QuestionVo> trueOrFalse;
    List<QuestionVo> multiple;
    @ApiModelProperty(required = true)
    List<QuestionVo> trueOrFalseResult;
    @ApiModelProperty(required = true)
    List<QuestionVo> multipleResult;
    List<QuestionVo> wrongAnswer;
    List<QuizStatistic> quizStatisticList;
//    @ApiModelProperty(value = "")
//    private Integer id;
//    @ApiModelProperty(value = "")
//    private Integer userId;
//    @ApiModelProperty(value = "")
//    private String duration;
//    @ApiModelProperty(value = "")
//    private Integer totalQuestion;
//    @ApiModelProperty(value = "")
//    private Integer trueQuestion;
//    @ApiModelProperty(value = "")
//    private Date createtime;
//    @ApiModelProperty(value = "")
//    private Date completetime;
}
