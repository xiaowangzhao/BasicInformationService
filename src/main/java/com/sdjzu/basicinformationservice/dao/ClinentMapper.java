package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Clinent;
import java.util.List;

public interface ClinentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Clinent record);

    Clinent selectByPrimaryKey(Long id);

    List<Clinent> selectAll();

    int updateByPrimaryKey(Clinent record);
}