package com.example.cybersecurityawareness.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.mapper.TopicMapper;
import com.example.cybersecurityawareness.model.Topic;

import java.util.List;

@Service
public class TopicService {

    @Resource
    private TopicMapper topicMapper;


    public int deleteByPrimaryKey(Integer id) {
        return topicMapper.deleteByPrimaryKey(id);
    }


    public int insert(Topic record) {
        return topicMapper.insert(record);
    }


    public int insertSelective(Topic record) {
        return topicMapper.insertSelective(record);
    }


    public Topic selectByPrimaryKey(Integer id) {
        return topicMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Topic record) {
        return topicMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Topic record) {
        return topicMapper.updateByPrimaryKey(record);
    }

    public List<Topic> selectAll() {
        return topicMapper.selectAll();
    }
}

