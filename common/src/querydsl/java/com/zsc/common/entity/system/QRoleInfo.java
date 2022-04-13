package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleInfo is a Querydsl query type for RoleInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleInfo extends EntityPathBase<RoleInfo> {

    private static final long serialVersionUID = 1220332234L;

    public static final QRoleInfo roleInfo = new QRoleInfo("roleInfo");

    public final com.zsc.common.entity.base.QHasCreateEntity _super = new com.zsc.common.entity.base.QHasCreateEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    //inherited
    public final StringPath creatorName = _super.creatorName;

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    //inherited
    public final StringPath modifiedName = _super.modifiedName;

    public final StringPath name = createString("name");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QRoleInfo(String variable) {
        super(RoleInfo.class, forVariable(variable));
    }

    public QRoleInfo(Path<? extends RoleInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleInfo(PathMetadata metadata) {
        super(RoleInfo.class, metadata);
    }

}

