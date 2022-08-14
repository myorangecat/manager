package com.hikvision.manager.result;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    public boolean isSuccess;
    public int code;
    public String message;
    public Object data;
}
