package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Readingdoctor;
import java.util.List;

public interface ReadingdoctorMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Readingdoctor record);

    Readingdoctor selectByPrimaryKey(String tno);

    List<Readingdoctor> selectAll();

    int updateByPrimaryKey(Readingdoctor record);
}