package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Tdegree;
import java.util.List;

public interface TdegreeMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Tdegree record);

    Tdegree selectByPrimaryKey(String tno);

    List<Tdegree> selectAll();

    int updateByPrimaryKey(Tdegree record);
}