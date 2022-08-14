package com.hikvision.manager.result;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Page<T> implements Serializable {

    public static int DEFAULT_PAGE_SIZE=20;
    /**
     * 每页显示个数
     */
    private int pageSize;
    /**
     * 当前页数
     */
    private int currentPage;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 结果列表
     */
    private List<T> rows;

    public Page(int currentPage,int pageSize,List<T> data){
        this.currentPage=currentPage;
        this.rows=data;
        this.pageSize=pageSize;
        this.totalCount=data.size();
        this.totalPage=data.size()/pageSize;
    }

    public Page(){
        this.currentPage = 1;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }
    public Page(int currentPage,int pageSize){
        this.currentPage=currentPage<=0?1:currentPage;
        this.pageSize=pageSize<=0?1:pageSize;
    }
}
