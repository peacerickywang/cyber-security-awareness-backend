package com.example.cybersecurityawareness.service;

import com.example.cybersecurityawareness.modelVo.QuestionVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.model.Question;
import com.example.cybersecurityawareness.mapper.QuestionMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionService{

    @Resource
    private QuestionMapper questionMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return questionMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Question record) {
        return questionMapper.insert(record);
    }

    
    public int insertSelective(Question record) {
        return questionMapper.insertSelective(record);
    }

    
    public Question selectByPrimaryKey(Integer id) {
        return questionMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Question record) {
        return questionMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Question record) {
        return questionMapper.updateByPrimaryKey(record);
    }

    public List<QuestionVo> randomQuestionByType(int type, int number) {
        Map map = new HashMap();
        map.put("type", type);
        map.put("number", number);
        return questionMapper.randomQuestionByType(map);
    }

    public List<QuestionVo> randomSimpleQuestionByType(int type, int number) {
        Map map = new HashMap();
        map.put("type", type);
        map.put("number", number);
        return questionMapper.randomSimpleQuestionByType(map);
    }

    public QuestionVo selectVoByPrimaryKey(Integer id) {
        return questionMapper.selectVoByPrimaryKey(id);
    }
}
