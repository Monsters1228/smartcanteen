package com.zsc.common.entity.base;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QHasCreateEntity is a Querydsl query type for HasCreateEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QHasCreateEntity extends EntityPathBase<HasCreateEntity> {

    private static final long serialVersionUID = -906635435L;

    public static final QHasCreateEntity hasCreateEntity = new QHasCreateEntity("hasCreateEntity");

    public final QHasTimeEntity _super = new QHasTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> created = _super.created;

    public final StringPath creatorName = createString("creatorName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modified = _super.modified;

    public final StringPath modifiedName = createString("modifiedName");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QHasCreateEntity(String variable) {
        super(HasCreateEntity.class, forVariable(variable));
    }

    public QHasCreateEntity(Path<? extends HasCreateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHasCreateEntity(PathMetadata metadata) {
        super(HasCreateEntity.class, metadata);
    }

}

