package com.hikvision.manager.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tag")
public class Tag {
    @TableField(value = "id")
    private int id;

    @TableField("name")
    private String name;

    @TableField("createtime")
    private Date createTimes;

    @TableField("updatetime")
    private Date updateTime;

    @TableField("delete")
    private boolean delete;
}
