package com.sdjzu.basicinformationservice.service.Impl;

import com.sdjzu.basicinformationservice.dao.SpecialityMapper;
import com.sdjzu.basicinformationservice.entity.Speciality;
import com.sdjzu.basicinformationservice.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/13 10:42
 */
@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityMapper specialityMapper;

    @Override
    public List<Speciality> selectAllBySpecid(String specid) {
        return specialityMapper.selectAllBySpecid(specid);
    }

    @Override
    public String selectSpceNameBySpecid(String specid) {
        return specialityMapper.selectSpecname(specid);
    }

    @Override
    public String selectSpecId(String tno) {
        return specialityMapper.selectSpecId(tno);
    }
}
