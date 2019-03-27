package com.lzx.fescarinfrustructor.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exception(){
        return "exception";
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String runtimeExceotion(){
        return "runtimeException";
    }
}
