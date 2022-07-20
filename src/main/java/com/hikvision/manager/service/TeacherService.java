package com.hikvision.manager.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hikvision.manager.entity.Teacher;

import java.util.List;

public interface TeacherService extends IService<Teacher> {

    Teacher queryTeacherById();
    List<Teacher> queryTeacherByIds();


}
