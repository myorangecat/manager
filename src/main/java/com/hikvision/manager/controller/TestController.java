package com.hikvision.manager.controller;

import com.hikvision.manager.entity.Student;
import com.hikvision.manager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/test")
    public Student test(){
        return studentService.selectById(1);
    }
    /**
     * @RequestParam
     * Not support Object param
     * MappingType /xxx/xxx{param} or /xxx/xxx
     * url 127.0.0.1:8080/xxx/xxx?param=value
     *
     * --------------------------------
     * @PathVariable
     * MappingType /xxx/xxx/{param}
     * url 127.0.0.1:8080/xxx/xxx/value
     * */
    @RequestMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.selectById(id);
    }

    @PostMapping("/getStudentByIds")
    public List<Student> getStudentByIds(@RequestParam("ids") List<Integer> ids){
        return studentService.selectByIdBatch(ids);
    }

    @PostMapping(value = "/insertInstance",consumes = "application/json")
    public Integer updateStudentById(@RequestBody Student student){
        return studentService.insertInstance(student);
    }

    @RequestMapping("/getStudentByWrapper")
    public List<Student> getStudentByWrapper(){
        return studentService.selectByWrapper();
    }
}
