package com.zsc.common.util;

import com.zsc.common.entity.base.IHasValueAndNameEnum;
import org.springframework.util.Assert;

import javax.persistence.AttributeConverter;
import java.lang.reflect.ParameterizedType;

/**
 * 基础枚举转换为数值类型，用于数据存贮到数据库中
 * @author Monsters
 * @date 2021/12/2 9:13 上午
 */
public class EnumValueConvert<T extends Enum<?> & IHasValueAndNameEnum>
        implements AttributeConverter<T, Integer> {

    private T[] enums;
    private String enumName;

    /** 构建方法 */
    public EnumValueConvert() {
        // 取得T 的实际类型
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<?> classT = (Class<?>) pt.getActualTypeArguments()[0];
        enums = (T[]) classT.getEnumConstants();
        this.enumName = classT.getName();
        Assert.notEmpty(enums, String.format("没有%s取得类型的枚举项", classT.getName()));
    }

    /** 转换枚举为数值 */
    @Override
    public Integer convertToDatabaseColumn(T attribute) {
        if (attribute == null) return null;
        return attribute.getValue();
    }

    /** 转换数据为枚举 */
    @Override
    public T convertToEntityAttribute(Integer dbData) {
        if (dbData == null) return null;
        for (var item : enums) {
            if (item.getValue() == dbData) return item;
        }
        throw new RuntimeException(String.format("无法将值%d转换为%s", dbData, enumName));
    }

    /** 将数据转换为想要的枚举类型,这个枚举要实现了IHasValueAndNameEnum */
    public static <N extends Enum<?> & IHasValueAndNameEnum> N of(int value, Class<N> classinfo) {
        // 取得T 的实际类型
        var enumsList = (N[]) classinfo.getEnumConstants();

        for (var item : enumsList) {
            if (item.getValue() == value) return item;
        }
        throw new RuntimeException(String.format("无法将值%d转换为%s", value, classinfo.getName()));
    }
}
