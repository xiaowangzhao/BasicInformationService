package com.sdjzu.basicinformationservice.controller;

import com.sdjzu.basicinformationservice.Exception.ExceptionHandle;
import com.sdjzu.basicinformationservice.service.SpecialityService;
import com.sdjzu.basicinformationservice.util.Result;
import com.sdjzu.basicinformationservice.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangqin
 * @date 2019/5/13 10:43
 */
@RestController
@RequestMapping("/speciality")
public class SpecialityController {
    @Autowired
    private SpecialityService specialityService;

    @Autowired
    private ExceptionHandle exceptionHandle;

    //获取所以的专业id
    @RequestMapping(value = "/getallbyspecid", method = {RequestMethod.GET})
    public Result getAllBySpecid(@RequestParam(value = "specid", required = true)String specid) {
        Result result = ResultUtil.success();
        try{
            result = ResultUtil.success(specialityService.selectAllBySpecid(specid));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    //通过专业id获取专业名
    @RequestMapping(value = "/getspecnamebyspecid", method = {RequestMethod.GET})
    public Result getSpecNameBySpecid(@RequestParam(value = "specid", required = true)String specid) {
        Result result = ResultUtil.success();
        try{
            result = ResultUtil.success(specialityService.selectSpceNameBySpecid(specid));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    //通过tid获取专业id
    @RequestMapping(value = "/getspecidbytno", method = {RequestMethod.GET})
    public Result getSpecIdByTno(@RequestParam(value = "tno", required = true)String tno) {
        Result result = ResultUtil.success();
        try{
            result = ResultUtil.success(specialityService.selectSpecId(tno));
        }catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }
}
