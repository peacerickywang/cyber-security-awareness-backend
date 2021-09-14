package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "post")
@Data
public class Post {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String postTitle;

    @ApiModelProperty(value = "")
    private String postContent;

    @ApiModelProperty(value = "")
    private Date createtime;

    @ApiModelProperty(value = "")
    private Date updatetime;

    @ApiModelProperty(value = "")
    private Integer topicId;

    @ApiModelProperty(value = "")
    private Integer userId;
}