package com.hikvision.manager.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hikvision.manager.entity.Teacher;
import com.hikvision.manager.mapper.TeacherMapper;
import com.hikvision.manager.service.TeacherService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Override
    public Teacher queryTeacherById() {
        return null;
    }

    @Override
    public List<Teacher> queryTeacherByIds() {
        return null;
    }
}
