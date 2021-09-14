package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "video")
@Data
public class Video {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "")
    private String description;

    @ApiModelProperty(value = "")
    private String url;

    @ApiModelProperty(value = "")
    private String duration;

    @ApiModelProperty(value = "")
    private Integer topicId;
}