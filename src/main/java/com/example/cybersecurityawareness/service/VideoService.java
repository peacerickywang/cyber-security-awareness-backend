package com.example.cybersecurityawareness.service;

import com.example.cybersecurityawareness.modelVo.VideoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cybersecurityawareness.mapper.VideoMapper;
import com.example.cybersecurityawareness.model.Video;

import java.util.List;

@Service
public class VideoService{

    @Resource
    private VideoMapper videoMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return videoMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Video record) {
        return videoMapper.insert(record);
    }

    
    public int insertSelective(Video record) {
        return videoMapper.insertSelective(record);
    }

    
    public Video selectByPrimaryKey(Integer id) {
        return videoMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Video record) {
        return videoMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Video record) {
        return videoMapper.updateByPrimaryKey(record);
    }

    public List<VideoVo> selectAllVo () {
        return videoMapper.selectAllVo();
    }

    public PageInfo<VideoVo> selectByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<VideoVo> lists = videoMapper.selectAllVo();
        PageInfo<VideoVo> pageInfo = new PageInfo<VideoVo>(lists);
        return pageInfo;
    }

    public VideoVo selectByRandom() {
        return videoMapper.selectByRandom();
    }
}
