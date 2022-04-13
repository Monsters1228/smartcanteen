package com.zsc.common.entity.system;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleMenu is a Querydsl query type for RoleMenu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleMenu extends EntityPathBase<RoleMenu> {

    private static final long serialVersionUID = 1220443003L;

    public static final QRoleMenu roleMenu = new QRoleMenu("roleMenu");

    public final com.zsc.common.entity.base.QBaseEntity _super = new com.zsc.common.entity.base.QBaseEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> menuId = createNumber("menuId", Integer.class);

    public final NumberPath<Integer> roleId = createNumber("roleId", Integer.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QRoleMenu(String variable) {
        super(RoleMenu.class, forVariable(variable));
    }

    public QRoleMenu(Path<? extends RoleMenu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleMenu(PathMetadata metadata) {
        super(RoleMenu.class, metadata);
    }

}

