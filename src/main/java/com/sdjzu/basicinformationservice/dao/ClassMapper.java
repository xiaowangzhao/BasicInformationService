package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Class;
import java.util.List;

public interface ClassMapper {
    int deleteByPrimaryKey(String classname);

    int insert(Class record);

    Class selectByPrimaryKey(String classname);

    List<Class> selectAll();

    int updateByPrimaryKey(Class record);
}