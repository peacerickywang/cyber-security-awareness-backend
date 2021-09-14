package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "quiz")
@Data
public class Quiz {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer userId;

    @ApiModelProperty(value = "")
    private String duration;

    @ApiModelProperty(value = "")
    private Integer totalQuestion;

    @ApiModelProperty(value = "")
    private Integer trueQuestion;

    @ApiModelProperty(value = "")
    private Date createtime;

    @ApiModelProperty(value = "")
    private Date completetime;
}