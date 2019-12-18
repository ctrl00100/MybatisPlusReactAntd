package com.example.my.mybatispp.controller;


import com.example.my.mybatispp.config.RestResult;
import com.example.my.mybatispp.config.StatusCode;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RestResult error(Exception e){
        e.printStackTrace();
        return new RestResult(false, StatusCode.ERROR, "cccc  not ok");
    }
}
