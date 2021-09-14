package com.example.cybersecurityawareness.modelVo;

import com.example.cybersecurityawareness.model.Message;
import com.example.cybersecurityawareness.model.User;
import lombok.Data;

@Data
public class MessageVo extends Message {
    User user;
}
