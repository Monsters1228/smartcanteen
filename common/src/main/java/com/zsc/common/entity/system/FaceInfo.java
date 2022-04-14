package com.zsc.common.entity.system;

import com.zsc.common.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @author Monsters
 * @date 2022/4/14 9:21 下午
 */
@Data
@Entity
public class FaceInfo extends BaseEntity {

    // 用户id
    Integer userId;

    // 人脸 id
    String faceId;

    // 人脸特征
    byte[] faceFeature;
}
