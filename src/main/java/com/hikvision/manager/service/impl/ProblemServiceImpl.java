package com.hikvision.manager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hikvision.manager.entity.Problem;
import com.hikvision.manager.entity.Tag;
import com.hikvision.manager.mapper.ProblemMapper;
import com.hikvision.manager.result.Page;
import com.hikvision.manager.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.Date;
import java.util.List;

@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, Problem> implements ProblemService {

    @Autowired
    public ProblemMapper problemMapper;

    @Override
    public Page<Problem> queryAll(int currentPage,int pageSize) {
        QueryWrapper<Problem> queryWrapper=new QueryWrapper<>();
        try{
            queryWrapper.;
        }catch(Exception e){
            e.printStackTrace();
        }
        List<Problem> problemList=problemMapper.selectList(queryWrapper);

        return problemList;
    }

    @Override
    public Problem queryById(int id) {
        return null;
    }

    @Override
    public List<Problem> queryByTags(List<Tag> tags) {
        return null;
    }

    @Override
    public List<Problem> queryByDate(List<Date> date) {
        return null;
    }

    @Override
    public boolean add(Problem problem) {
        try{
            problemMapper.insert(problem);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Problem problem) {
        return false;
    }

    @Override
    public boolean deleteByIds(List<Integer> ids) {
        return false;
    }
}
