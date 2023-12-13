package com.itheima.exception;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Result handleException(Exception e){
        log.error("程序运行出错了 ....",e);
        return Result.error("对不起，系统访问异常，请联系管理员");
    }
    @ExceptionHandler
    public Result handleException2(DuplicateKeyException e){
        log.error("程序运行出错了 ....",e);
        return Result.error("属性值chongfu");
    }

}
