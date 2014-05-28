package com.equivi.demailer.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuditableEntity is a Querydsl query type for AuditableEntity
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QAuditableEntity extends EntityPathBase<AuditableEntity> {

    private static final long serialVersionUID = -985343958L;

    public static final QAuditableEntity auditableEntity = new QAuditableEntity("auditableEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final DateTimePath<java.util.Date> createdDateTime = createDateTime("createdDateTime", java.util.Date.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Long> lastUpdatedBy = createNumber("lastUpdatedBy", Long.class);

    public final DateTimePath<java.util.Date> lastUpdatedDateTime = createDateTime("lastUpdatedDateTime", java.util.Date.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QAuditableEntity(String variable) {
        super(AuditableEntity.class, forVariable(variable));
    }

    public QAuditableEntity(Path<? extends AuditableEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditableEntity(PathMetadata<?> metadata) {
        super(AuditableEntity.class, metadata);
    }

}

