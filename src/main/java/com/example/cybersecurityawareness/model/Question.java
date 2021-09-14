package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="question")
@Data
public class Question {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String title;

    @ApiModelProperty(value="")
    private Integer topicId;

    @ApiModelProperty(value="")
    private Byte type;

    @ApiModelProperty(value="")
    private String answer;

    @ApiModelProperty(value="")
    private String explaination;
}