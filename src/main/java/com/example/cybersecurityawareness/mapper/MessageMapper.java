package com.example.cybersecurityawareness.mapper;

import com.example.cybersecurityawareness.model.Message;

public interface MessageMapper {
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
    int insert(Message record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Message record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Message selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Message record);

    int deleteByPostId(int postId);
}