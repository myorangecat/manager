package com.hikvision.manager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hikvision.manager.entity.Problem;
import com.hikvision.manager.entity.Tag;
import com.hikvision.manager.result.Page;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface ProblemService extends IService<Problem> {

    Page<Problem> queryAll(int currentPage, int pageSize);
    Problem queryById(int id);
    List<Problem> queryByTags(List<Tag> tags);
    List<Problem> queryByDate(List<Date> date);
    boolean add(Problem problem);
    boolean update(Problem problem);
    boolean deleteByIds(List<Integer> ids);
}
