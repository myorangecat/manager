package com.hikvision.manager.result;

import com.hikvision.manager.entity.Problem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultBuild<T> {

    Result result=new Result();

    public Result ok(){

        result.setSuccess(true);
        result.setCode(200);
        result.setMessage("操作成功");
        return result;
    }
    public Result successData(Page<Problem> pages){
        result.setSuccess(true);
        result.setCode(200);
        result.setData(pages);
        result.setMessage("保存成功");
        return result;
    }
    public Result successDelete(){

        result.setSuccess(true);
        result.setCode(200);
        result.setMessage("删除成功");
        return result;
    }
    public Result successUpdate(){

        result.setSuccess(true);
        result.setCode(200);
        result.setMessage("更新成功");
        return result;
    }
    public Result fail(){

        result.setSuccess(false);
        result.setCode(500);
        result.setMessage("操作失败");
        return result;
    }
}
