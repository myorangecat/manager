package com.hikvision.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("map")
public class Map {

    @TableField(value = "id")
    private int id;

    @TableField("proId")
    private int proId;

    @TableField("tagId")
    private int tagId;
}
