package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Apiparam;
import java.util.List;

public interface ApiparamMapper {
    int deleteByPrimaryKey(String paramname);

    int insert(Apiparam record);

    Apiparam selectByPrimaryKey(String paramname);

    List<Apiparam> selectAll();

    int updateByPrimaryKey(Apiparam record);
}