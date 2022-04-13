package com.zsc.common.entity.base;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * 带创建时间带基础实体
 * @author Monsters
 * @date 2021/12/1 8:08 下午
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class HasTimeEntity extends BaseEntity{

    // 创建时间
    @Column(nullable = false)
    @CreatedDate
    private LocalDateTime created;

    // 修改时间
    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime modified;
}
