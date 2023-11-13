package com.itheima.d2_exception;

/**
 * 自定义编译时异常
 * 1、继承Exception.
 * 2、重写父类构造器。
 */
public class ItheimaAgeIllegalException extends Exception{
    public ItheimaAgeIllegalException() {
    }

    public ItheimaAgeIllegalException(String message) {
        super(message);
    }
}
