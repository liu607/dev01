package com.fc.dao;

import com.fc.entity.Studentsubject;
import com.fc.entity.StudentsubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsubjectMapper {
    long countByExample(StudentsubjectExample example);

    int deleteByExample(StudentsubjectExample example);

    int deleteByPrimaryKey(Integer ssid);

    int insert(Studentsubject record);

    int insertSelective(Studentsubject record);

    List<Studentsubject> selectByExample(StudentsubjectExample example);

    Studentsubject selectByPrimaryKey(Integer ssid);

    int updateByExampleSelective(@Param("record") Studentsubject record, @Param("example") StudentsubjectExample example);

    int updateByExample(@Param("record") Studentsubject record, @Param("example") StudentsubjectExample example);

    int updateByPrimaryKeySelective(Studentsubject record);

    int updateByPrimaryKey(Studentsubject record);
}