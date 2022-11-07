package com.zh.engine.util;

import com.zh.engine.exception.CommonException;

/**
 * @description: 断言工具类
 * @author: zhouh
 * @create: 2022-11-07 18:17
 **/
public class Assert {

    public static void notEmpty(Object value, String message) {
        if (ObjectUtil.isNotEmpty(value)) {
            return;
        }
        throw new CommonException(message);
    }
}
