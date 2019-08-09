package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.BasicinformationserviceApplicationTests;
import com.sdjzu.basicinformationservice.entity.Speciality;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/13 10:29
 */
public class spectest extends BasicinformationserviceApplicationTests {

    @Autowired
    private SpecialityMapper specialityMapper;

    @Test
    public void testSelectAllBySpecid() {
        List<Speciality> specialities = specialityMapper.selectAllBySpecid("");
        for(Speciality speciality : specialities) {
            System.out.println(speciality);
        }
    }
}

