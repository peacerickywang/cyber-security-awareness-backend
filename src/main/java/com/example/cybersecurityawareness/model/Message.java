package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="message")
@Data
public class Message {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(required = true)
    private String messageContent;

    @ApiModelProperty(value="")
    private Date createtime;

    @ApiModelProperty(value="")
    private Date updatetime;

    @ApiModelProperty(value="")
    private Integer userId;

    @ApiModelProperty(required = true)
    private Integer postId;
}