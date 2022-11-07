package com.zh.engine.exception;

/**
 * @description: 通用异常
 * @author: zhouh
 * @create: 2022-11-07 18:18
 **/
public class CommonException extends BaseException {

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Integer code) {
        super(message, code);
    }
}
