package com.hikvision.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import sun.util.calendar.BaseCalendar;
import javax.xml.soap.Text;
import java.sql.Blob;
import java.sql.Date;


@Data
@TableName("problem")
public class Problem {

    private int id;

    private String name;

    private String text;

    private Date createTime;

    private Date updateTime;

    private boolean delete;
}
