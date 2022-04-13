package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserInfo is a Querydsl query type for UserInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserInfo extends EntityPathBase<UserInfo> {

    private static final long serialVersionUID = 1220445087L;

    public static final QUserInfo userInfo = new QUserInfo("userInfo");

    public final com.zsc.common.entity.base.QBaseUserInfo _super = new com.zsc.common.entity.base.QBaseUserInfo(this);

    public final StringPath className = createString("className");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    //inherited
    public final StringPath email = _super.email;

    public final StringPath faceFileName = createString("faceFileName");

    public final StringPath faculty = createString("faculty");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    //inherited
    public final StringPath password = _super.password;

    //inherited
    public final StringPath phone = _super.phone;

    public final StringPath userId = createString("userId");

    //inherited
    public final StringPath username = _super.username;

    //inherited
    public final EnumPath<com.zsc.common.entity.base.UserType> userType = _super.userType;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath wechat = createString("wechat");

    public QUserInfo(String variable) {
        super(UserInfo.class, forVariable(variable));
    }

    public QUserInfo(Path<? extends UserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserInfo(PathMetadata metadata) {
        super(UserInfo.class, metadata);
    }

}

