package com.example.cybersecurityawareness.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.model.User;
import com.example.cybersecurityawareness.mapper.UserMapper;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }


    public int insert(User record) {
        return userMapper.insert(record);
    }


    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }


    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    public User selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }
}

