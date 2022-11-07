package com.zh.engine.exception.enums;

import com.zh.engine.exception.BaseException;

/**
 * @description: 枚举解析数据为空异常
 * @author: zhouh
 * @create: 2022-11-07 18:25
 **/
public class ParseValueIsNullException extends BaseException {
    public ParseValueIsNullException() {
        super("枚举解析数据为空");
    }
}
