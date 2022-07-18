package com.hikvision.manager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hikvision.manager.entity.Student;
import com.hikvision.manager.entity.Teacher;
import com.hikvision.manager.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest("com.hikvision.manager.test")
public class TestContext {
    @Autowired
    StudentMapper studentMapper;

    @Test
    public void test1(){
        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
        //select *from student where age=13 or id>3
        queryWrapper
                .select("id","name","age","number","address","createtime","updatetime")
                .eq(true,"age",13)
                .or()
                .ge(true,"id",3);
        List<Student> list=studentMapper.selectList(queryWrapper);
        System.out.println(list);
    }
}
