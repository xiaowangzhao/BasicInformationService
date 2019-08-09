package com.sdjzu.basicinformationservice.service.Impl;

import com.sdjzu.basicinformationservice.dao.StudentMapper;
import com.sdjzu.basicinformationservice.entity.Student;
import com.sdjzu.basicinformationservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangqin
 * @date 2019/5/12 13:17
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 模糊查询，通过classname和specid查询
     * @param classname
     * @param specid
     * @return
     */
    @Override
    public List<Student> selectByClassname(String classname, String specid) {
        return studentMapper.selectByClassname(classname, specid);
    }

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    @Override
    public int updateByStuid(Student student) {
        return studentMapper.updateByStuid(student);
    }

    /**
     * 模糊查询，查找专业的学生
     * @param specid
     * @param classname
     * @param sname
     * @return
     */
    @Override
    public List<Student> selectAllInfo(String specid, String classname, String sname) {
        return studentMapper.selectAllInfo(specid, classname, sname);
    }


    @Override
    public Student getByStuid(String stuid) {
        return
                studentMapper.selectByStuid(stuid);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public Student selectStudent(String stuid) {

        return studentMapper.selectStudent(stuid);
    }


    /**
     * wangzhao
     * @param
     * @return
     */
    @Override
    public List<Student> getAllinfo(String specid, String classname, String sname) {
        return  studentMapper.selectAllInfo(specid,classname,sname);

    }


    @Override
    public List<String> getallstuid() {
        return studentMapper.getAllstuid();
    }

}
