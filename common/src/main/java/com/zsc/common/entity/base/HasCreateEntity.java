package com.zsc.common.entity.base;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

/**
 * @author Monsters
 * @date 2022/4/13 2:55 下午
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class HasCreateEntity extends HasTimeEntity{

    // 创建着名称
    @Column(nullable = false)
    private String creatorName;

    // 修改者名称
    @Column(nullable = false)
    private String modifiedName;
}
