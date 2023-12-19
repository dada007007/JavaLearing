package com.itheima.exception;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.DateTimeException;

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
    // 属性值重复返回错误
    @ExceptionHandler
    public Result handleException2(DuplicateKeyException e){
        log.error("程序运行出错了 ....",e);
        return Result.error("属性值重复");
    }
    //  如果班级下关联的有学生, 则不允许删除该版本,
    //  并提示错误信息 : "对不起, 该班级下有学生, 不能直接删除"
    @ExceptionHandler
    public Result handleException3(UnsupportedOperationException e){
        log.error("程序运行出错了 ....",e);
        return Result.error("对不起, 该班级下有学生, 不能直接删除");
    }

    // 扣分数据类型有问题
    @ExceptionHandler
    public Result handleException4(NumberFormatException e){
        log.error("程序运行出错了 ....",e);
        return Result.error("传入数值类型不合法");
    }

    // 日期数据类型有问题
    @ExceptionHandler
    public Result handleException5(DateTimeException e){
        log.error("程序运行出错了 ....",e);
        return Result.error("传入日期数据不合法");
    }

}
