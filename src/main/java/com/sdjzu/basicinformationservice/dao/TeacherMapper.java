package com.sdjzu.basicinformationservice.dao;

import com.sdjzu.basicinformationservice.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface TeacherMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(String tno);

    List<Teacher> selectAll();

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    int updateTeacher(@Param("teacher") Teacher teacher);

    //通过tno获取教师
    Teacher selectTeaByTno(String tno);

    //获取tname
    String selectTnameByTno(String tno);

    //获取所以的教师号
    List<Teacher> selectTno();

    //获取所以的教师号
    List<Teacher> selectTnoTname();

}