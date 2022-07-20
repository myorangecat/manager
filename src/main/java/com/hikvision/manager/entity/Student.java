package com.hikvision.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("student")
public class Student {
    @TableField(value = "id")
    private int id;
    @TableField("name")
    private String name;
    @TableField("age")
    private int age;
    @TableField("number")
    private int number;
    @TableField("address")
    private String address;
    @TableField("createtime")
    private Date createtime;
    @TableField("updatetime")
    private Date updatetime;
}
