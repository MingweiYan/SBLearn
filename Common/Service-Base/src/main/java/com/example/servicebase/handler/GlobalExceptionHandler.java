package com.example.servicebase.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.commonutils.R;


/**
 * 统一异常处理类
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error();
    }

    // 针对自定义异常的处理
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public R error(MyException e){
        return R.error().message(e.getMsg());
    }

}


