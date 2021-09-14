package com.example.cybersecurityawareness.modelVo;

import com.example.cybersecurityawareness.model.Option;
import com.example.cybersecurityawareness.model.Question;
import lombok.Data;

import java.util.List;

@Data
public class QuestionVo extends Question {
    String user_answer;
    List<Option> options;
}
