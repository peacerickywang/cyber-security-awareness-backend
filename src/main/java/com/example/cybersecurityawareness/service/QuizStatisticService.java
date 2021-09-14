package com.example.cybersecurityawareness.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.model.QuizStatistic;
import com.example.cybersecurityawareness.mapper.QuizStatisticMapper;
@Service
public class QuizStatisticService{

    @Resource
    private QuizStatisticMapper quizStatisticMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return quizStatisticMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(QuizStatistic record) {
        return quizStatisticMapper.insert(record);
    }

    
    public int insertSelective(QuizStatistic record) {
        return quizStatisticMapper.insertSelective(record);
    }

    
    public QuizStatistic selectByPrimaryKey(Integer id) {
        return quizStatisticMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(QuizStatistic record) {
        return quizStatisticMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(QuizStatistic record) {
        return quizStatisticMapper.updateByPrimaryKey(record);
    }

}
