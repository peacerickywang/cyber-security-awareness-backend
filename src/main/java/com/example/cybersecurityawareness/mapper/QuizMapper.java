package com.example.cybersecurityawareness.mapper;

import com.example.cybersecurityawareness.model.Quiz;
import com.example.cybersecurityawareness.modelVo.QuizVo;

import java.util.List;

public interface QuizMapper {
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
    int insert(Quiz record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Quiz record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Quiz selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Quiz record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Quiz record);

    List<QuizVo> selectVoByUserId(Integer id);

    QuizVo selectVoByPrimaryKey(int quizId);
}