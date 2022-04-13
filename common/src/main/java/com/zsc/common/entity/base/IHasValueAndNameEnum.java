package com.zsc.common.entity.base;

/**
 * 拥有值与名称的枚举接口
 * @author Monsters
 * @date 2021/12/2 8:09 上午
 */
public interface IHasValueAndNameEnum {
    /** 取得对应的值 */
    public int getValue();

    /** 取得对应的值 */
    public String getName();
}
