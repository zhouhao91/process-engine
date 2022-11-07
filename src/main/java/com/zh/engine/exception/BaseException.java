package com.zh.engine.exception;

/**
 * @description: 异常基类
 * @author: zhouh
 * @create: 2022-11-07 18:09
 **/
public abstract class BaseException extends RuntimeException {

    protected Integer code;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
