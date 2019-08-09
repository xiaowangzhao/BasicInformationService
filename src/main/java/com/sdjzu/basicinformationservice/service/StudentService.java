package com.sdjzu.basicinformationservice.service;

import com.sdjzu.basicinformationservice.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/12 13:15
 */
public interface StudentService {

    /**
     * 模糊查询，通过classname和specid查询
     * @param classname
     * @param specid
     * @return
     */
    List<Student> selectByClassname(String classname, String specid);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int updateByStuid(Student student);

    /**
     * 模糊查询，查找专业的学生
     * @param specid
     * @param classname
     * @param sname
     * @return
     */
    List<Student> selectAllInfo(String specid,  String classname, String sname);

    Student getByStuid(String stuid);

    List<Student> selectAllStudent();

    Student selectStudent(String stuid);


    List<Student> getAllinfo(@Param("specid") String specid,@Param("classname") String classname,@Param("sname") String sname);


    List<String> getallstuid();
}
