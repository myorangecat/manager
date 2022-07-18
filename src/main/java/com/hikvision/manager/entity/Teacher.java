package com.hikvision.manager.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Teacher")
public class Teacher {
    @TableField("id")
    private int id;
    @TableField("name")
    private String name;
    @TableField("age")
    private int age;
    @TableField("phone")
    private String phone;
    @TableField("classId")
    private int classId;
    @TableField("address")
    private String address;
    @TableField("createTime")
    private Date createTime;
    @TableField("updateTime")
    private Date updateTime;
}
