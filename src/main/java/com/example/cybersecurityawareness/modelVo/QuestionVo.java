package com.example.cybersecurityawareness.modelVo;

import com.example.cybersecurityawareness.model.Option;
import com.example.cybersecurityawareness.model.Question;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class QuestionVo extends Question {
    @ApiModelProperty(required = true)
    String user_answer;
    List<Option> options;
}
