package com.sdjzu.basicinformationservice.service;

import com.sdjzu.basicinformationservice.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/12 15:04
 */

public interface TeacherService {

    Teacher selectTeaByTno(String tno);

    //获取tname
    String selectTnameByTno(String tno);

    //获取所以的教师号
    List<Teacher> getTno();

    //获取所以的教师号
    List<Teacher> selectTnoTname();

    List<Teacher> selectAll();

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    int updateTeacher(Teacher teacher);
}
