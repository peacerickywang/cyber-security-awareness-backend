package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.modelVo.VideoVo;
import com.example.cybersecurityawareness.service.UserService;
import com.example.cybersecurityawareness.service.VideoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "Video API")
@RestController
@RequestMapping("api")
public class VideoController extends BaseController {
    @Resource
    UserService userService;
    @Resource
    VideoService videoService;

    @ApiOperation("Query Video by Page")
    @RequestMapping(value = {"/video/page"}, method = RequestMethod.GET)
    public JSONObject selectByPage(@RequestParam int pageNum, @RequestParam int pageSize) {
        PageInfo<VideoVo> videoPageInfo = videoService.selectByPage(pageNum, pageSize);
        return requestResponse(true, videoPageInfo);
    }

    @ApiOperation("Random Video")
    @RequestMapping(value = {"/video/random"}, method = RequestMethod.GET)
    public JSONObject selectByRandom() {
        VideoVo videoPageInfo = videoService.selectByRandom();
        return requestResponse(true, videoPageInfo);
    }
}
