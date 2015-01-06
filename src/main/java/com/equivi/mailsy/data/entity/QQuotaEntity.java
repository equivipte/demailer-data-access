package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QQuotaEntity is a Querydsl query type for QuotaEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QQuotaEntity extends EntityPathBase<QuotaEntity> {

    private static final long serialVersionUID = 1057970865L;

    public static final QQuotaEntity quotaEntity = new QQuotaEntity("quotaEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final NumberPath<Long> currentEmailsSent = createNumber("currentEmailsSent", Long.class);

    public final NumberPath<Long> currentEmailsVerified = createNumber("currentEmailsVerified", Long.class);

    public final NumberPath<Long> emailSendingQuota = createNumber("emailSendingQuota", Long.class);

    public final NumberPath<Long> emailVerifyQuota = createNumber("emailVerifyQuota", Long.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QQuotaEntity(String variable) {
        super(QuotaEntity.class, forVariable(variable));
    }

    public QQuotaEntity(Path<? extends QuotaEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuotaEntity(PathMetadata<?> metadata) {
        super(QuotaEntity.class, metadata);
    }

}

