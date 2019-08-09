package com.sdjzu.basicinformationservice.controller;

import com.sdjzu.basicinformationservice.Exception.ExceptionHandle;
import com.sdjzu.basicinformationservice.entity.Teacher;
import com.sdjzu.basicinformationservice.service.TeacherService;
import com.sdjzu.basicinformationservice.util.Result;
import com.sdjzu.basicinformationservice.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liangqin
 * @date 2019/5/12 13:19
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private ExceptionHandle exceptionHandle;

    /**
     * 获取教师
     * @param tno
     * @return
     */
    @RequestMapping(value = "/getteabytno", method = {RequestMethod.GET})
    public Result getTeaByTno(@RequestParam(value = "tno", required = true) String tno) {
        Result result;
        try{
            result = ResultUtil.success(teacherService.selectTeaByTno(tno));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 获取教师名字
     * @param tno
     * @return
     */
    @RequestMapping(value = "/gettnamebytno", method = {RequestMethod.GET})
    public Result getTnameByTno(@RequestParam(value = "tno", required = true) String tno) {
        Result result;
        try{
            result = ResultUtil.success(teacherService.selectTnameByTno(tno));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 获取教师编号
     * @return
     */
    @RequestMapping(value = "/gettno", method = {RequestMethod.GET})
    public Result getTno() {
        Result result;
        try{
            result = ResultUtil.success(teacherService.getTno());
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }


    /**
     * 获取教师编号
     * @return
     */
    @RequestMapping(value = "/gettnotname", method = {RequestMethod.GET})
    public Result getTnoTname() {
        Result result;
        try{
            result = ResultUtil.success(teacherService.selectTnoTname());
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 获取教师
     * @return
     */
    @RequestMapping(value = "/getallteacher", method = {RequestMethod.GET})
    public Result getAllTeacher() {
        Result result;
        try{
            result = ResultUtil.success(teacherService.selectAll());
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @RequestMapping(value = "/updateteacher", method = {RequestMethod.POST})
    public Result updateTeacher(@RequestBody Teacher teacher) {
        Result result;
        try{
            System.out.println(teacher);
            teacherService.updateTeacher(teacher);
            result = ResultUtil.success("修改成功");
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }
}
