package com.zsc.common.entity.system;

import com.zsc.common.entity.base.BaseUserInfo;
import lombok.Data;

import javax.persistence.Entity;

/**
 * 管理员实体类
 * @author Monsters
 * @date 2021/12/2 12:37 上午
 */
@Data
@Entity
public class ManagerInfo extends BaseUserInfo {

    // 角色id
    private long roleId;

    // 状态
    private Boolean status;

}
