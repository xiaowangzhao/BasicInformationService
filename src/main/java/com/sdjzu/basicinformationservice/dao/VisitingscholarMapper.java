package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Visitingscholar;
import java.util.List;

public interface VisitingscholarMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Visitingscholar record);

    Visitingscholar selectByPrimaryKey(String tno);

    List<Visitingscholar> selectAll();

    int updateByPrimaryKey(Visitingscholar record);
}