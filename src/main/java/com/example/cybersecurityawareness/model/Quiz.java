package com.example.cybersecurityawareness.model;

import lombok.Data;

import java.util.List;

@Data
public class Quiz {
    List<Question> trueOrFalse;
    List<Question> multiple;
    int mark;
}
