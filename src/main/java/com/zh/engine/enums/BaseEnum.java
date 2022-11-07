package com.zh.engine.enums;

import java.util.Objects;

/**
 * @description: 枚举基类
 * @author: zhouh
 * @create: 2022-11-07 17:36
 **/
public interface BaseEnum<E extends BaseEnum<E, T>, T> {

//    T getCode();
//
//    String getDescribe();
//
//    E[] values();
//
//    default E parseFromCode(T code) {
//        for (E e : values()) {
//            if (Objects.equals(e.getCode(), code)) {
//                return e;
//            }
//        }
//        return null;
//    }
}
