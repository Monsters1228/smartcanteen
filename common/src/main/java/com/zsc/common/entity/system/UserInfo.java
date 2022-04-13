package com.zsc.common.entity.system;

import com.zsc.common.entity.base.BaseUserInfo;
import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;

/**
 * 普通用户实体
 * @author Monsters
 * @date 2021/12/1 8:00 下午
 */
@Data
@Entity
@Proxy(lazy = false)
public class UserInfo extends BaseUserInfo {

    // 微信号
    private  String wechat;

    // 学好
    private  String userId;

    // 学院
    private String faculty;

    // 班级
    private String className;

    // 人脸照片UUID名称
    private String faceFileName;
}
