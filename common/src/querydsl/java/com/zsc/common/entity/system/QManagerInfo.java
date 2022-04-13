package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QManagerInfo is a Querydsl query type for ManagerInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QManagerInfo extends EntityPathBase<ManagerInfo> {

    private static final long serialVersionUID = -223078475L;

    public static final QManagerInfo managerInfo = new QManagerInfo("managerInfo");

    public final com.zsc.common.entity.base.QBaseUserInfo _super = new com.zsc.common.entity.base.QBaseUserInfo(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    //inherited
    public final StringPath creatorName = _super.creatorName;

    //inherited
    public final StringPath email = _super.email;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    //inherited
    public final StringPath modifiedName = _super.modifiedName;

    //inherited
    public final StringPath password = _super.password;

    //inherited
    public final StringPath phone = _super.phone;

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public final BooleanPath status = createBoolean("status");

    //inherited
    public final StringPath username = _super.username;

    //inherited
    public final EnumPath<com.zsc.common.entity.base.UserType> userType = _super.userType;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QManagerInfo(String variable) {
        super(ManagerInfo.class, forVariable(variable));
    }

    public QManagerInfo(Path<? extends ManagerInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QManagerInfo(PathMetadata metadata) {
        super(ManagerInfo.class, metadata);
    }

}

