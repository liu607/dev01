package com.fc.dao;

import com.fc.entity.Pjclass;
import com.fc.entity.PjclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PjclassMapper {
    long countByExample(PjclassExample example);

    int deleteByExample(PjclassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Pjclass record);

    int insertSelective(Pjclass record);

    List<Pjclass> selectByExample(PjclassExample example);

    Pjclass selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Pjclass record, @Param("example") PjclassExample example);

    int updateByExample(@Param("record") Pjclass record, @Param("example") PjclassExample example);

    int updateByPrimaryKeySelective(Pjclass record);

    int updateByPrimaryKey(Pjclass record);
}