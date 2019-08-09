package com.sdjzu.basicinformationservice.service.Impl;

import com.sdjzu.basicinformationservice.dao.ClassMapper;
import com.sdjzu.basicinformationservice.entity.Class;
import com.sdjzu.basicinformationservice.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassMapper classMapper;
    @Override
    public Class selectbycalssname(String classname) {
        return  classMapper.selectByPrimaryKey(classname);
    }
}
