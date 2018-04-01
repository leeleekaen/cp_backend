package com.cp_backend;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一处理Exception
 */
@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody

    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return "error";
    }

}
