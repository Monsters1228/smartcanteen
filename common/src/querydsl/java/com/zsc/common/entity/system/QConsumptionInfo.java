package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QConsumptionInfo is a Querydsl query type for ConsumptionInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConsumptionInfo extends EntityPathBase<ConsumptionInfo> {

    private static final long serialVersionUID = 1088153507L;

    public static final QConsumptionInfo consumptionInfo = new QConsumptionInfo("consumptionInfo");

    public final com.zsc.common.entity.base.QHasTimeEntity _super = new com.zsc.common.entity.base.QHasTimeEntity(this);

    public final DateTimePath<java.time.LocalDateTime> consumeTime = createDateTime("consumeTime", java.time.LocalDateTime.class);

    public final EnumPath<com.zsc.common.entity.base.ConsumeType> consumeType = createEnum("consumeType", com.zsc.common.entity.base.ConsumeType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QConsumptionInfo(String variable) {
        super(ConsumptionInfo.class, forVariable(variable));
    }

    public QConsumptionInfo(Path<? extends ConsumptionInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConsumptionInfo(PathMetadata metadata) {
        super(ConsumptionInfo.class, metadata);
    }

}

