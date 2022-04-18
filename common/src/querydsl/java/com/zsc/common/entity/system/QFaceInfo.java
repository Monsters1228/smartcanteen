package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFaceInfo is a Querydsl query type for FaceInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaceInfo extends EntityPathBase<FaceInfo> {

    private static final long serialVersionUID = 1983632689L;

    public static final QFaceInfo faceInfo = new QFaceInfo("faceInfo");

    public final com.zsc.common.entity.base.QBaseEntity _super = new com.zsc.common.entity.base.QBaseEntity(this);

    public final ArrayPath<byte[], Byte> faceFeature = createArray("faceFeature", byte[].class);

    public final StringPath faceId = createString("faceId");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QFaceInfo(String variable) {
        super(FaceInfo.class, forVariable(variable));
    }

    public QFaceInfo(Path<? extends FaceInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFaceInfo(PathMetadata metadata) {
        super(FaceInfo.class, metadata);
    }

}

