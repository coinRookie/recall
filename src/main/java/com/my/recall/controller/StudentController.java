package com.my.recall.controller;

import com.my.recall.base.BaseController;
import com.my.recall.service.StudentService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.annotation.RegisterMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController extends BaseController {
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public Map getStudent() {
        Map<String, Object> resuMap = new HashMap<>();
        //resuMap.put("data",studentService.getStudentList());
        super.seccussMap(resuMap, studentService.getStudentList());
        return resuMap;
    }
}
