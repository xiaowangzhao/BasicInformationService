package com.sdjzu.basicinformationservice.controller;

import com.sdjzu.basicinformationservice.Exception.ExceptionHandle;
import com.sdjzu.basicinformationservice.entity.Student;
import com.sdjzu.basicinformationservice.service.ClassService;
import com.sdjzu.basicinformationservice.service.StudentService;
import com.sdjzu.basicinformationservice.util.Result;
import com.sdjzu.basicinformationservice.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liangqin
 * @date 2019/5/12 13:19
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ExceptionHandle exceptionHandle;

    @Autowired
    private ClassService classService;

    /**
     * 模糊查询，通过classname和specid查询
     * @param classname
     * @param specid
     * @return
     */
    @RequestMapping(value = "/getstubyspecandcname", method = {RequestMethod.GET})
    public Result getStudentsBySpecidAndClassname(@RequestParam(value = "classname") String classname,
                                                  @RequestParam(value = "specid") String specid) {
        Result result = ResultUtil.success();
        try{
            result = ResultUtil.success(studentService.selectByClassname(classname, specid));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 通过id获得学生
     * @param stuid
     * @return
     */
    @RequestMapping(value = "/getstubystuid", method = {RequestMethod.GET})
    public Result getStuByStuid(@RequestParam(value = "stuid") String stuid) {
        Result result = ResultUtil.success();
        try{
            result = ResultUtil.success(studentService.selectStudent(stuid));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 获得全部学生
     * @return
     */
    @RequestMapping(value = "/getallstudent", method = {RequestMethod.GET})
    public Result getAllStudent() {
        Result result;
        try{
            result = ResultUtil.success(studentService.selectAllStudent());
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    @RequestMapping(value = "/updatebystuid", method = {RequestMethod.POST})
    public Result updateByStuid(@RequestBody Student student) {
        Result result;
        try{
            studentService.updateByStuid(student);
            result = ResultUtil.success("修改成功！");
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    @RequestMapping(value = "/selectallinfo", method = {RequestMethod.GET})
    public Result selectAllInfo(@RequestParam(value = "specid") String specid,
                                @RequestParam(value = "classname", required = false) String classname,
                                @RequestParam(value = "sname", required = false) String sname) {
        Result result;
        try{
            result = ResultUtil.success(studentService.selectAllInfo(specid,classname, sname));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * wangzhao
      * @param stuid
     * @return
     */
    @RequestMapping(value="getstudentbystuid" ,method = RequestMethod.GET)
    public Result getStudentbystuid(@RequestParam String stuid){
        return ResultUtil.success(studentService.getByStuid(stuid));

    }

    /**
     * 按学生查询详细的盲审信息
     */
    @RequestMapping(value = "/getpaperreviewinfos",method = RequestMethod.GET)
    public Result getPaperReviewInfos(@RequestParam("specid") String specid,@RequestParam("classname") String classname,@RequestParam("stuname") String stuname){
        return ResultUtil.success(studentService.getAllinfo(specid,classname,stuname));
    }
    /**
     * 得到所有学生的学号
     */
    @RequestMapping(value = "getallstuid")
    public Result getallstuid(){
        return ResultUtil.success(studentService.getallstuid());
    }

    @RequestMapping(value  ="getclassbyclassname",method = RequestMethod.GET)
    public Result getclassbyclassname(@RequestParam String classname){
        return ResultUtil.success(classService.selectbycalssname(classname));
    }
}
