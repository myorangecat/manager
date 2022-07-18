package com.hikvision.manager.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hikvision.manager.entity.Student;
import com.hikvision.manager.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface  StudentService  extends IService<Student> {

    public Student selectById(Integer id);
    public List<Student> selectByIdBatch(List<Integer> ids);
    public List<Student> selectByWrapper();
    public Integer insertInstance(Student student);
    public Integer deleteInstanceById(Integer id);
    public Integer updateInstance(Student student);
}
