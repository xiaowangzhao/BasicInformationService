package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.School;
import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(String scno);

    int insert(School record);

    School selectByPrimaryKey(String scno);

    List<School> selectAll();

    int updateByPrimaryKey(School record);
}