package com.hikvision.manager.controller;


import com.hikvision.manager.entity.Problem;
import com.hikvision.manager.result.Page;
import com.hikvision.manager.result.Result;
import com.hikvision.manager.result.ResultBuild;
import com.hikvision.manager.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProblemController {
    @Autowired
    ProblemService problemService;

    @GetMapping("/queryProblems")
    public Result queryProblems(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize")int pageSize){
        ResultBuild<Problem> resultBuild=new ResultBuild<>();
        Page<Problem> pages=problemService.queryAll(currentPage,pageSize);
        if(pages.getTotalCount()!=0){
            return resultBuild.successData(pages);
        }else {
            return resultBuild.fail();
        }
    }
}
