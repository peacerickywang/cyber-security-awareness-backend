package com.example.cybersecurityawareness.modelVo;

import com.example.cybersecurityawareness.model.Message;
import com.example.cybersecurityawareness.model.Post;
import com.example.cybersecurityawareness.model.Topic;
import com.example.cybersecurityawareness.model.User;
import lombok.Data;

import java.util.List;
@Data
public class PostVo extends Post {
    User user;
    Topic topic;
    List<MessageVo> messageList;
}
