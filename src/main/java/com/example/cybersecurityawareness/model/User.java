package com.example.cybersecurityawareness.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "`user`")
@Data
public class User {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(required = true)
    private String username;

    @ApiModelProperty(required = true)
    private String email;

    @ApiModelProperty(required = true)
    private String password;

    @ApiModelProperty(value = "")
    private String salt;

    @ApiModelProperty(value = "")
    private Date createtime;
}