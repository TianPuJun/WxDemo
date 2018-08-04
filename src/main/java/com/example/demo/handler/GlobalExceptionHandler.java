package com.example.demo.handler;
/**
 * 异常处理类
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 统一异常处理
     * 统一异常处理
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionhandler(HttpServletRequest req,Exception e){
        Map<String,Object> modeMap = new HashMap<String,Object>();
        modeMap.put("success",false);
        modeMap.put("errMsg",e.getMessage());
        return modeMap;
    }
}
