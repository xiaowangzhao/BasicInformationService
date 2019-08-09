package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.ApiParamRelation;
import java.util.List;

public interface ApiParamRelationMapper {
    int deleteByPrimaryKey(String paramno);

    int insert(ApiParamRelation record);

    ApiParamRelation selectByPrimaryKey(String paramno);

    List<ApiParamRelation> selectAll();

    int updateByPrimaryKey(ApiParamRelation record);
}