package com.zsc.common.entity.base;

/**
 * 消费类型
 * @author Monsters
 * @date 2021/12/2 1:07 上午
 */
public enum ConsumeType {
    consume(1, "消费"),
    recharge(2, "充值"),
    refund(1,"退款");


    private int value;
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

    ConsumeType(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
