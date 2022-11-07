package com.zh.engine.enums;

import com.zh.engine.exception.enums.NotFindEnumValueException;
import com.zh.engine.exception.enums.ParseValueIsNullException;
import com.zh.engine.util.ObjectUtil;
import lombok.Getter;

import java.util.Objects;

/**
 * @description: 布尔类型枚举
 * @author: zhouh
 * @create: 2022-11-07 17:29
 **/
@Getter
public enum BooleanEnum {
    TRUE("T", "是"),
    FALSE("F", "否"),
    ;
    private String code;
    private String describe;

    BooleanEnum(String code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public boolean isTrue() {
        return Objects.equals(this, BooleanEnum.TRUE);
    }

    public boolean isFalse() {
        return !isTrue();
    }

    public static BooleanEnum parseFromCode(String code) {
        if (ObjectUtil.isEmpty(code)) {
            throw new ParseValueIsNullException();
        }
        if (Objects.equals(TRUE.code, code)) {
            return TRUE;
        } else if (Objects.equals(FALSE.code, code)) {
            return FALSE;
        } else {
            throw new NotFindEnumValueException();
        }
    }

    public static BooleanEnum parseFromBooleanTextIgnoreCase(String text) {
        if (ObjectUtil.isEmpty(text)) {
            throw new ParseValueIsNullException();
        }
        if (Objects.equals("true", text.toLowerCase())) {
            return TRUE;
        } else if (Objects.equals("false", text.toLowerCase())) {
            return FALSE;
        } else {
            throw new NotFindEnumValueException();
        }
    }
}
