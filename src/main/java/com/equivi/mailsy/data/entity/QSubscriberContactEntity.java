package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSubscriberContactEntity is a Querydsl query type for SubscriberContactEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSubscriberContactEntity extends EntityPathBase<SubscriberContactEntity> {

    private static final long serialVersionUID = 821136849L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriberContactEntity subscriberContactEntity = new QSubscriberContactEntity("subscriberContactEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final QContactEntity contactEntity;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final QSubscriberGroupEntity subscriberGroupEntity;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSubscriberContactEntity(String variable) {
        this(SubscriberContactEntity.class, forVariable(variable), INITS);
    }

    public QSubscriberContactEntity(Path<? extends SubscriberContactEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSubscriberContactEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSubscriberContactEntity(PathMetadata<?> metadata, PathInits inits) {
        this(SubscriberContactEntity.class, metadata, inits);
    }

    public QSubscriberContactEntity(Class<? extends SubscriberContactEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contactEntity = inits.isInitialized("contactEntity") ? new QContactEntity(forProperty("contactEntity")) : null;
        this.subscriberGroupEntity = inits.isInitialized("subscriberGroupEntity") ? new QSubscriberGroupEntity(forProperty("subscriberGroupEntity")) : null;
    }

}

