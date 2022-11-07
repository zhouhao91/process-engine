package com.zh.engine.util;

import java.util.Collection;
import java.util.Map;

/**
 * @description:
 * @author: zhouh
 * @create: 2022-11-07 18:20
 **/
public class ObjectUtil {

    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }

        if (obj instanceof String) {
            return ((String) obj).trim().length() == 0;
        } else if (obj instanceof Collection<?>) {
            return ((Collection<?>) obj).size() == 0;
        } else if (obj instanceof Map<?, ?>) {
            return ((Map<?, ?>) obj).size() == 0;
        } else if (obj instanceof Object[]) {
            return ((Object[]) obj).length == 0;
        } else if (obj instanceof boolean[]) {
            return ((boolean[]) obj).length == 0;
        } else if (obj instanceof byte[]) {
            return ((byte[]) obj).length == 0;
        } else if (obj instanceof char[]) {
            return ((char[]) obj).length == 0;
        } else if (obj instanceof short[]) {
            return ((short[]) obj).length == 0;
        } else if (obj instanceof int[]) {
            return ((int[]) obj).length == 0;
        } else if (obj instanceof long[]) {
            return ((long[]) obj).length == 0;
        } else if (obj instanceof float[]) {
            return ((float[]) obj).length == 0;
        } else if (obj instanceof double[]) {
            return ((double[]) obj).length == 0;
        }

        return false;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }
}
