package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Sycode;
import java.util.List;

public interface SycodeMapper {
    int deleteByPrimaryKey(Long codeid);

    int insert(Sycode record);

    Sycode selectByPrimaryKey(Long codeid);

    List<Sycode> selectAll();

    int updateByPrimaryKey(Sycode record);
}