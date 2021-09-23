package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "`option`")
@Data
public class Option {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String key;

    @ApiModelProperty(value = "")
    private String value;

    @ApiModelProperty(value = "")
    private Integer questionId;
}