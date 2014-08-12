package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSubscriberEntity is a Querydsl query type for SubscriberEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSubscriberEntity extends EntityPathBase<SubscriberEntity> {

    private static final long serialVersionUID = -1636886027L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriberEntity subscriberEntity = new QSubscriberEntity("subscriberEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final StringPath city = createString("city");

    public final StringPath companyName = createString("companyName");

    public final StringPath country = createString("country");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath domainName = createString("domainName");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath firstName = createString("firstName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastName = createString("lastName");

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final StringPath phone = createString("phone");

    public final QSubscriberGroupEntity subscriberGroupEntity;

    public final EnumPath<SubscribeStatus> subscribeStatus = createEnum("subscribeStatus", SubscribeStatus.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath zipCode = createString("zipCode");

    public QSubscriberEntity(String variable) {
        this(SubscriberEntity.class, forVariable(variable), INITS);
    }

    public QSubscriberEntity(Path<? extends SubscriberEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSubscriberEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSubscriberEntity(PathMetadata<?> metadata, PathInits inits) {
        this(SubscriberEntity.class, metadata, inits);
    }

    public QSubscriberEntity(Class<? extends SubscriberEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.subscriberGroupEntity = inits.isInitialized("subscriberGroupEntity") ? new QSubscriberGroupEntity(forProperty("subscriberGroupEntity")) : null;
    }

}

