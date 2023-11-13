package com.itheima.d2_exception;

/**
 * 自定义运行时异常
 * 1、继承Exception.
 * 2、重写父类构造器。
 */
public class ItheimaAgeIllegalRuntimeException extends RuntimeException{
    public ItheimaAgeIllegalRuntimeException() {
    }

    public ItheimaAgeIllegalRuntimeException(String message) {
        super(message);
    }
}
