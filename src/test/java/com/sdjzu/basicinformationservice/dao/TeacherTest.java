package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.BasicinformationserviceApplicationTests;
import com.sdjzu.basicinformationservice.entity.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/12 14:58
 */
public class TeacherTest extends BasicinformationserviceApplicationTests {

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void selectTeaByTno() {
        Teacher teacher = teacherMapper.selectTeaByTno("110001");
        System.out.println(teacher);
    }

    @Test
    public void selectTnameByTno() {
        System.out.println(teacherMapper.selectTnameByTno("110004"));
    }
}
