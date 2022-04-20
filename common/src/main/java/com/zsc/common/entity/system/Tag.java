package com.zsc.common.entity.system;

import com.zsc.common.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @author Monsters
 * @date 2022/4/20 9:39 上午
 */
@Data
@Entity
public class Tag extends BaseEntity {

    // rfid 标签
    private String tagId;

    // 菜品名称
    private String foodName;

    // 菜品类型
    private Integer foodType;

    // 单价
    private double price;
}
