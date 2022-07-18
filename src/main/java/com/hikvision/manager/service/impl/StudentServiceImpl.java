package com.hikvision.manager.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hikvision.manager.entity.Student;
import com.hikvision.manager.mapper.StudentMapper;
import com.hikvision.manager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectById(id);
    }

    @Override
    public List<Student> selectByIdBatch(List<Integer> ids) {
        return studentMapper.selectBatchIds(ids);
    }

    @Override
    public List<Student> selectByWrapper() {
        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
        //select *from student where age=13 or id>3
        queryWrapper
                .select("id","name","age","number","address","createtime","updatetime")
                .eq(true,"age",13)
                .or()
                .ge(true,"id",3);
       return studentMapper.selectList(queryWrapper);
    }

    @Override
    public Integer insertInstance(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Integer deleteInstanceById(Integer id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public Integer updateInstance(Student student) {
        return studentMapper.updateById(student);
    }


}
