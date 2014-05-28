package com.equivi.demailer.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = 939395100L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final NumberPath<Integer> failedLoginCounter = createNumber("failedLoginCounter", Integer.class);

    public final StringPath firstName = createString("firstName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastName = createString("lastName");

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final StringPath password = createString("password");

    public final StringPath phoneNo = createString("phoneNo");

    public final BooleanPath resetPasswordRequired = createBoolean("resetPasswordRequired");

    public final StringPath userName = createString("userName");

    public final EnumPath<UserRole> userRole = createEnum("userRole", UserRole.class);

    public final EnumPath<UserStatus> userStatus = createEnum("userStatus", UserStatus.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata<?> metadata) {
        super(UserEntity.class, metadata);
    }

}

