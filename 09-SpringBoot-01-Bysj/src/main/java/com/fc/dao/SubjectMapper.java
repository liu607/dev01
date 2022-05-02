package com.fc.dao;

import com.fc.entity.Subject;
import com.fc.entity.SubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    long countByExample(SubjectExample example);

    int deleteByExample(SubjectExample example);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectExample example);

    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);
}