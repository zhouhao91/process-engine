package com.zh.engine.exception.enums;

import com.zh.engine.exception.BaseException;

/**
 * @description: 枚举解析异常
 * @author: zhouh
 * @create: 2022-11-07 18:14
 **/
public class NotFindEnumValueException extends BaseException {
    public NotFindEnumValueException() {
        super("解析错误, 不能找到枚举值");
    }
}
