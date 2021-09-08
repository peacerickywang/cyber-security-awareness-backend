package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import com.example.cybersecurityawareness.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "操作接口")
@RestController
@RequestMapping("hs")
public class HelloController {

    @ApiOperation("添加")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字", dataType = "String", required = true),
            @ApiImplicitParam(name = "typeId", value = "类型ID", dataType = "Long", required = true)
    })
    @PutMapping("add")
    public JSONObject add(String name, Long typeId){
        Topic topic = new Topic();
        return JSONObject.parseObject(JSONObject.toJSONString(topic));
    }

    @ApiOperation("获取")
    @GetMapping("get")
    public JSONObject get(@ApiParam(name = "id", value = "数据ID") Long id){
        Topic topic = new Topic();
        return JSONObject.parseObject(JSONObject.toJSONString(topic));
    }

}