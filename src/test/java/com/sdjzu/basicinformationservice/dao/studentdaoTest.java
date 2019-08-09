package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.BasicinformationserviceApplicationTests;
import com.sdjzu.basicinformationservice.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/12 11:28
 */
public class studentdaoTest  extends BasicinformationserviceApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void selectByClassname() {
        List<Student> students = studentMapper.selectByClassname("软测142", "003");
        for(Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void selectStudent() {
        Student student = studentMapper.selectStudent("20141111003");
        System.out.println(student);
    }

    @Test
    public void selectAllStudent() {
        List<Student> students = studentMapper.selectAllInfo("003", "软测14", "");
        for(Student student : students) {
            System.out.println(student);
        }

    }
}
