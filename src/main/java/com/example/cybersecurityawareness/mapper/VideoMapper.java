package com.example.cybersecurityawareness.mapper;

import com.example.cybersecurityawareness.model.Video;
import com.example.cybersecurityawareness.modelVo.VideoVo;

import java.util.List;

public interface VideoMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Video record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Video record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Video selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Video record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Video record);

    List<Video> selectAll();

    List<VideoVo> selectAllVo();

    VideoVo selectByRandom();
}