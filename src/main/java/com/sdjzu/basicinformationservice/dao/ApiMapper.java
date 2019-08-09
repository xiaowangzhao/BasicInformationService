package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Api;
import java.util.List;

public interface ApiMapper {
    int deleteByPrimaryKey(Integer apino);

    int insert(Api record);

    Api selectByPrimaryKey(Integer apino);

    List<Api> selectAll();

    int updateByPrimaryKey(Api record);
}