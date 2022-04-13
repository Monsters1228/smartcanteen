package com.zsc.common.entity.base;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseUserInfo is a Querydsl query type for BaseUserInfo
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseUserInfo extends EntityPathBase<BaseUserInfo> {

    private static final long serialVersionUID = -496061714L;

    public static final QBaseUserInfo baseUserInfo = new QBaseUserInfo("baseUserInfo");

    public final QHasCreateEntity _super = new QHasCreateEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    //inherited
    public final StringPath creatorName = _super.creatorName;

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    //inherited
    public final StringPath modifiedName = _super.modifiedName;

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath username = createString("username");

    public final EnumPath<UserType> userType = createEnum("userType", UserType.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QBaseUserInfo(String variable) {
        super(BaseUserInfo.class, forVariable(variable));
    }

    public QBaseUserInfo(Path<? extends BaseUserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseUserInfo(PathMetadata metadata) {
        super(BaseUserInfo.class, metadata);
    }

}

