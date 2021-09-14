package com.example.cybersecurityawareness.service;

import com.example.cybersecurityawareness.modelVo.PostVo;
import com.example.cybersecurityawareness.modelVo.VideoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.mapper.PostMapper;
import com.example.cybersecurityawareness.model.Post;

import java.util.List;

@Service
public class PostService {

    @Resource
    private PostMapper postMapper;


    public int deleteByPrimaryKey(Integer id) {
        return postMapper.deleteByPrimaryKey(id);
    }


    public int insert(Post record) {
        return postMapper.insert(record);
    }


    public int insertSelective(Post record) {
        return postMapper.insertSelective(record);
    }


    public Post selectByPrimaryKey(Integer id) {
        return postMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Post record) {
        return postMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Post record) {
        return postMapper.updateByPrimaryKey(record);
    }

    public PageInfo<Post> selectByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Post> lists = postMapper.selectAllSimple();
        PageInfo<Post> pageInfo = new PageInfo<Post>(lists);
        return pageInfo;
    }

    public PostVo selectVoByPrimaryKey(int id) {
        return postMapper.selectVoByPrimaryKey(id);
    }
}

