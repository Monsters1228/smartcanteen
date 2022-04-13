package com.zsc.common.entity.system;

import com.zsc.common.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @author Monsters
 * @date 2022/4/13 11:24 上午
 */
@Data
@Entity
public class Menu extends BaseEntity {

    private String menuName;

    private String permission;
}
