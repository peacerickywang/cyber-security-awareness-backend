package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.model.Topic;
import com.example.cybersecurityawareness.service.TopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "Topic API")
@RestController
@RequestMapping("api")
public class TopicController extends BaseController {
    @Resource
    TopicService topicService;

    @ApiOperation("Query All Topics")
    @RequestMapping(value = {"/topic"}, method = RequestMethod.GET)
    public JSONObject selectAllTopics() {
        List<Topic> topicList = topicService.selectAll();
        return requestResponse(true, topicList);
    }
}
