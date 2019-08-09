package com.sdjzu.basicinformationservice.service;

import com.sdjzu.basicinformationservice.entity.Speciality;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/13 10:42
 */
public interface SpecialityService {

    List<Speciality> selectAllBySpecid(String specid);

    String selectSpceNameBySpecid(String specid);

    String selectSpecId(String tno);
}
