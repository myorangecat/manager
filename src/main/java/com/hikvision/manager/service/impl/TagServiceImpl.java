package com.hikvision.manager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hikvision.manager.entity.Tag;
import com.hikvision.manager.mapper.TagMapper;
import com.hikvision.manager.service.TagService;

import java.util.List;

public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
    @Override
    public List<Tag> queryAll() {
        return null;
    }

    @Override
    public Tag queryById(int id) {
        return null;
    }

    @Override
    public boolean add(Tag tag) {
        return false;
    }

    @Override
    public boolean update(Tag tag) {
        return false;
    }

    @Override
    public boolean deleteByIds(List<Integer> ids) {
        return false;
    }
}
