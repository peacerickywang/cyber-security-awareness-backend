package com.example.cybersecurityawareness.service;

import com.example.cybersecurityawareness.modelVo.QuizVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.model.Quiz;
import com.example.cybersecurityawareness.mapper.QuizMapper;

import java.util.List;

@Service
public class QuizService {

    @Resource
    private QuizMapper quizMapper;


    public int deleteByPrimaryKey(Integer id) {
        return quizMapper.deleteByPrimaryKey(id);
    }


    public int insert(Quiz record) {
        return quizMapper.insert(record);
    }


    public int insertSelective(Quiz record) {
        return quizMapper.insertSelective(record);
    }


    public Quiz selectByPrimaryKey(Integer id) {
        return quizMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Quiz record) {
        return quizMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Quiz record) {
        return quizMapper.updateByPrimaryKey(record);
    }

    public List<QuizVo> selectVoByUserId(Integer id) {
        return quizMapper.selectVoByUserId(id);
    }

    public QuizVo selectVoByPrimaryKey(int quizId) {
        return quizMapper.selectVoByPrimaryKey(quizId);
    }
}

