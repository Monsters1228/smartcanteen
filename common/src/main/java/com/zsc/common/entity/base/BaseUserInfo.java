package com.zsc.common.entity.base;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

/**
 * 基础用户实体
 * @author Monsters
 * @date 2021/12/1 7:59 下午
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseUserInfo extends HasTimeEntity{

    // 用户名
    private String username;

    // 密码
    private String password;

    // 邮箱
    private String email;

    // 手机号
    private String phone;

    UserType userType;
}
