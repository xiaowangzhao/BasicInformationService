package com.sdjzu.basicinformationservice.service.Impl;

import com.sdjzu.basicinformationservice.dao.TeacherMapper;
import com.sdjzu.basicinformationservice.entity.Teacher;
import com.sdjzu.basicinformationservice.service.TeacherService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/12 15:05
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher selectTeaByTno(String tno) {
        return teacherMapper.selectTeaByTno(tno);
    }

    @Override
    public String selectTnameByTno(String tno) {
        return teacherMapper.selectTnameByTno(tno);
    }


    //获取所以的教师号
    @Override
    public List<Teacher> getTno(){
        return teacherMapper.selectTno();
    }

    //获取所以的教师号
    @Override
    public List<Teacher> selectTnoTname() {
        return teacherMapper.selectTnoTname();
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

}
