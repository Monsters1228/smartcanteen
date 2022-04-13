package com.zsc.common.entity.system;

import com.zsc.common.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @author Monsters
 * @date 2022/4/13 11:23 上午
 */
@Data
@Entity
public class RoleMenu extends BaseEntity {

    private int roleId;

    private int menuId;
}
