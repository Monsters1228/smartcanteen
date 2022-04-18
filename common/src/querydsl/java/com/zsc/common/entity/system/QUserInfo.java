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

    public final com.zsc.common.entity.base.QHasCreateEntity _super = new com.zsc.common.entity.base.QHasCreateEntity(this);

    public final StringPath className = createString("className");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    //inherited
    public final StringPath creatorName = _super.creatorName;

    public final StringPath faceId = createString("faceId");

    public final StringPath faculty = createString("faculty");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    //inherited
    public final StringPath modifiedName = _super.modifiedName;

    public final StringPath userId = createString("userId");

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

