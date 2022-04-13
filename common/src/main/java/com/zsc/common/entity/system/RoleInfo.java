package com.zsc.common.entity.system;

import com.zsc.common.entity.base.HasTimeEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @author Monsters
 * @date 2021/12/2 1:15 上午
 */
@Data
@Entity
public class RoleInfo extends HasTimeEntity {

    // 角色名称
    private String name;

    // 角色描述
    private  String description;

}
