package com.fc.dao;

import com.fc.entity.Studentexam;
import com.fc.entity.StudentexamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentexamMapper {
    long countByExample(StudentexamExample example);

    int deleteByExample(StudentexamExample example);

    int deleteByPrimaryKey(Integer seid);

    int insert(Studentexam record);

    int insertSelective(Studentexam record);

    List<Studentexam> selectByExample(StudentexamExample example);

    Studentexam selectByPrimaryKey(Integer seid);

    int updateByExampleSelective(@Param("record") Studentexam record, @Param("example") StudentexamExample example);

    int updateByExample(@Param("record") Studentexam record, @Param("example") StudentexamExample example);

    int updateByPrimaryKeySelective(Studentexam record);

    int updateByPrimaryKey(Studentexam record);
}