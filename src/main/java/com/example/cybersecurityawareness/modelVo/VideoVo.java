package com.example.cybersecurityawareness.modelVo;

import com.example.cybersecurityawareness.model.Topic;
import com.example.cybersecurityawareness.model.Video;
import lombok.Data;

@Data
public class VideoVo extends Video {
    Topic topic;
}
