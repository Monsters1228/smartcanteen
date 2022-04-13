package com.zsc.common.entity.base;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zsc.common.util.EnumValueConvert;
import lombok.Getter;

import javax.persistence.Converter;

/**
 * 用户类型枚举
 * @author Monsters
 * @date 2021/11/29 12:30 下午
 */

public enum UserType implements IHasValueAndNameEnum{
    user(1, "普通用户"),
    manager(1, "系统管理员");

    @Getter
    @JsonValue
    private int value;

    @Getter
    private String name;

    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    UserType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /** 从数值转换为枚举 */
    @JsonCreator
    public static UserType pasertFromValue(Long theValue) {
        for (var en : UserType.values()) {
            if (en.value == theValue) {
                return en;
            }
        }
        throw new RuntimeException(String.format("无法将值%d转换为UserType枚举", theValue));
    }

    /** 数据转换器，实现枚举类型可以转换为int到数据库 */
    @Converter(autoApply = true)
    public static class Convert extends EnumValueConvert<UserType> {}
}
