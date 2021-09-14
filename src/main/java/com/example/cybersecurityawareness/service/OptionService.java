package com.example.cybersecurityawareness.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.model.Option;
import com.example.cybersecurityawareness.mapper.OptionMapper;
@Service
public class OptionService{

    @Resource
    private OptionMapper optionMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return optionMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Option record) {
        return optionMapper.insert(record);
    }

    
    public int insertSelective(Option record) {
        return optionMapper.insertSelective(record);
    }

    
    public Option selectByPrimaryKey(Integer id) {
        return optionMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Option record) {
        return optionMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Option record) {
        return optionMapper.updateByPrimaryKey(record);
    }

}
