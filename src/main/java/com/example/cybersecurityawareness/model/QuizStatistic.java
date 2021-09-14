package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="quiz_statistic")
@Data
public class QuizStatistic {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private Integer quizId;

    @ApiModelProperty(value="")
    private Integer topicId;

    @ApiModelProperty(value="")
    private Integer trueCount = 0;

    @ApiModelProperty(value="")
    private Integer totalCount = 0;
}