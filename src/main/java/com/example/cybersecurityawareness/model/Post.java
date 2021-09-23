package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "post")
@Data
public class Post {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(required = true)
    private String postTitle;

    @ApiModelProperty(required = true)
    private String postContent;

    @ApiModelProperty(value = "")
    private Date createtime;

    @ApiModelProperty(value = "")
    private Date updatetime;

    @ApiModelProperty(required = true)
    private Integer topicId;

    @ApiModelProperty(value = "")
    private Integer userId;
}