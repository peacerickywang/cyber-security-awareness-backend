package com.example.cybersecurityawareness.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cybersecurityawareness.model.Message;
import com.example.cybersecurityawareness.model.Post;
import com.example.cybersecurityawareness.model.User;
import com.example.cybersecurityawareness.modelVo.PostVo;
import com.example.cybersecurityawareness.service.MessageService;
import com.example.cybersecurityawareness.service.PostService;
import com.example.cybersecurityawareness.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@Api(tags = "Messageboard API")
@RestController
@RequestMapping("api")
public class MessageBoardController extends BaseController {
    @Resource
    PostService postService;
    @Resource
    UserService userService;
    @Resource
    MessageService messageService;

    @ApiOperation("Query Posts by Page")
    @RequestMapping(value = {"/post/page"}, method = RequestMethod.GET)
    public JSONObject selectByPage(@RequestParam int pageNum, @RequestParam int pageSize) {
        try {
            PageInfo<Post> postPageInfo = postService.selectByPage(pageNum, pageSize);
            return requestResponse(true, postPageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false, e.getMessage());
        }
    }

    @ApiOperation("Query Post Detail")
    @RequestMapping(value = {"/post/{id}"}, method = RequestMethod.GET)
    public JSONObject selectPostInfo(@PathVariable int id) {
        try {
            PostVo postInfo = postService.selectVoByPrimaryKey(id);
            return requestResponse(true, postInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false, e.getMessage());
        }
    }

    @ApiOperation("Post")
    @RequestMapping(value = {"/post"}, method = RequestMethod.POST)
    @Transactional()
    public JSONObject post(@RequestBody Post post) {
        try {
            String email = String.valueOf(SecurityUtils.getSubject().getPrincipal());
            if (email.equalsIgnoreCase("null")){
                return requestResponse(false, "Please login first.");
            }
            User user = userService.selectUserByEmail(email);
            post.setUserId(user.getId());
            post.setCreatetime(new Date());
            postService.insertSelective(post);
            return requestResponse(true, "Post success.");
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false, e.getMessage());
        }
    }

    @ApiOperation("Reply Post")
    @RequestMapping(value = {"/post/reply"}, method = RequestMethod.POST)
    @Transactional()
    public JSONObject replyPost(@RequestBody Message message) {
        try {
            Post post = postService.selectByPrimaryKey(message.getPostId());
            post.setUpdatetime(new Date());
            String email = String.valueOf(SecurityUtils.getSubject().getPrincipal());
            if (email.equalsIgnoreCase("null")){
                return requestResponse(false, "Please login first.");
            }
            User user = userService.selectUserByEmail(email);
            Message newMessage = new Message();
            newMessage.setMessageContent(message.getMessageContent());
            newMessage.setPostId(message.getPostId());
            newMessage.setUserId(user.getId());
            newMessage.setCreatetime(new Date());
            messageService.insertSelective(newMessage);
            postService.updateByPrimaryKeySelective(post);
            return requestResponse(true, "Reply success.");
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false, e.getMessage());
        }
    }

    @ApiOperation("Delete Post")
    @RequestMapping(value = {"/post/delete"}, method = RequestMethod.DELETE)
    @Transactional()
    public JSONObject deletePost(@RequestParam int postId) {
        try {
            messageService.deleteByPostId(postId);
            postService.deleteByPrimaryKey(postId);
            return requestResponse(true, "Delete Post success.");
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false, e.getMessage());
        }
    }

    @ApiOperation("Delete Reply")
    @RequestMapping(value = {"/message/delete"}, method = RequestMethod.DELETE)
    @Transactional()
    public JSONObject deleteReply(@RequestParam int messageId) {
        try {
            messageService.deleteByPrimaryKey(messageId);
            return requestResponse(true, "Delete Reply success.");
        } catch (Exception e) {
            e.printStackTrace();
            return requestResponse(false, e.getMessage());
        }
    }
}
