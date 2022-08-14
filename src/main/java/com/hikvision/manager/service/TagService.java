package com.hikvision.manager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hikvision.manager.entity.Problem;
import com.hikvision.manager.entity.Tag;

import java.util.Date;
import java.util.List;

public interface TagService extends IService<Tag> {
    List<Tag> queryAll();
    Tag queryById(int id);
    boolean add(Tag tag);
    boolean update(Tag tag);
    boolean deleteByIds(List<Integer> ids);
}
