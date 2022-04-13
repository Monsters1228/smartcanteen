package com.zsc.common.entity.system;
import com.zsc.common.entity.base.HasTimeEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * 用户账户类
 * @author Monsters
 * @date 2021/12/2 12:48 上午
 */
@Data
@Entity
public class AccountInfo extends HasTimeEntity {

    // 用户id
    private long userId;

    // 账户余额
    private double balance;

    // 是否禁用
    private boolean disabled;
}
