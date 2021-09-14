package com.example.cybersecurityawareness.mapper;

import com.example.cybersecurityawareness.model.Post;import com.example.cybersecurityawareness.modelVo.PostVo;import java.util.List;

public interface PostMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Post record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Post record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Post selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Post record);

    List<Post> selectAllSimple();

    PostVo selectVoByPrimaryKey(int id);
}