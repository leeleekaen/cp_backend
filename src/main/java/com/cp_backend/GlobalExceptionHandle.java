package com.cp_backend;

import com.cp_backend.util.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一处理Exception
 */
@ControllerAdvice
public class GlobalExceptionHandle {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Message defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("系统异常：{}",e,e.getMessage());
        e.printStackTrace();
        return Message.errorMessage(e.getMessage());
    }

}
