package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSubscriberEntity is a Querydsl query type for SubscriberEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSubscriberEntity extends EntityPathBase<SubscriberEntity> {

    private static final long serialVersionUID = -1636886027L;

    public static final QSubscriberEntity subscriberEntity = new QSubscriberEntity("subscriberEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath domainName = createString("domainName");

    public final StringPath emailAddress = createString("emailAddress");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final EnumPath<SubscribeStatus> subscribeStatus = createEnum("subscribeStatus", SubscribeStatus.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSubscriberEntity(String variable) {
        super(SubscriberEntity.class, forVariable(variable));
    }

    public QSubscriberEntity(Path<? extends SubscriberEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubscriberEntity(PathMetadata<?> metadata) {
        super(SubscriberEntity.class, metadata);
    }

}

