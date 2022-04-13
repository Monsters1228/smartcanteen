package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccountInfo is a Querydsl query type for AccountInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccountInfo extends EntityPathBase<AccountInfo> {

    private static final long serialVersionUID = 603804213L;

    public static final QAccountInfo accountInfo = new QAccountInfo("accountInfo");

    public final com.zsc.common.entity.base.QHasTimeEntity _super = new com.zsc.common.entity.base.QHasTimeEntity(this);

    public final NumberPath<Double> balance = createNumber("balance", Double.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    public final BooleanPath disabled = createBoolean("disabled");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QAccountInfo(String variable) {
        super(AccountInfo.class, forVariable(variable));
    }

    public QAccountInfo(Path<? extends AccountInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccountInfo(PathMetadata metadata) {
        super(AccountInfo.class, metadata);
    }

}

