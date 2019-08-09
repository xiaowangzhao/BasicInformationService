package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Speciality;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SpecialityMapper {
    int deleteByPrimaryKey(String specid);

    int insert(Speciality record);

    Speciality selectByPrimaryKey(String specid);

    List<Speciality> selectAll();

    int updateByPrimaryKey(Speciality record);

    String selectSpecname(String specid);

    List<Speciality> selectAllBySpecid(String specid);

    String selectSpecId(String tno);

}