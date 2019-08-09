package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(String stuid);

    int insert(Student record);

    /**
     * 查询学生个人信息
     * @param stuid
     * @return
     */
    Student selectByStuid(String stuid);

    List<Student> selectAll();

    List<Student> selectAllStudent();

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int updateByStuid(@Param("student") Student student);

    /**
     * 模糊查询，通过classname和specid查询
     * @param classname
     * @param specid
     * @return
     */
    List<Student> selectByClassname(@Param("classname") String classname, @Param("specid") String specid);

    /**
     * 模糊查询，查找专业的学生
     * @param specid
     * @param classname
     * @param sname
     * @return
     */
    List<Student> selectAllInfo(@Param("specid") String specid, @Param("classname") String classname, @Param("sname") String sname);

    Student selectStudent(String stuid);


    List<String> getAllstuid();

}