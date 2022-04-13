package com.zsc.common.entity.system;
import com.zsc.common.entity.base.ConsumeType;
import com.zsc.common.entity.base.HasTimeEntity;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

/**
 * 消费数据详情
 * @author Monsters
 * @date 2021/12/2 12:49 上午
 */

@Data
@Entity
public class ConsumptionInfo extends HasTimeEntity {

    // 用户 id
    private long userId;

    // 消费金额
    private double price;

    // 消费时间
    LocalDateTime consumeTime;

    // 消费类型
    ConsumeType consumeType;
}
