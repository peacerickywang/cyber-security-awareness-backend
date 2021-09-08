package com.example.cybersecurityawareness.mapper;

import com.example.cybersecurityawareness.model.Topic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TopicMapper {
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
    int insert(Topic record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Topic record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Topic selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Topic record);
}