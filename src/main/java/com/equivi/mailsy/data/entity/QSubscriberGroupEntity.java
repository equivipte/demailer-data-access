package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSubscriberGroupEntity is a Querydsl query type for SubscriberGroupEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSubscriberGroupEntity extends EntityPathBase<SubscriberGroupEntity> {

    private static final long serialVersionUID = 675442800L;

    public static final QSubscriberGroupEntity subscriberGroupEntity = new QSubscriberGroupEntity("subscriberGroupEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath groupName = createString("groupName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final EnumPath<GenericStatus> status = createEnum("status", GenericStatus.class);

    public final ListPath<SubscriberEntity, QSubscriberEntity> subscribeEntityList = this.<SubscriberEntity, QSubscriberEntity>createList("subscribeEntityList", SubscriberEntity.class, QSubscriberEntity.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSubscriberGroupEntity(String variable) {
        super(SubscriberGroupEntity.class, forVariable(variable));
    }

    public QSubscriberGroupEntity(Path<? extends SubscriberGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubscriberGroupEntity(PathMetadata<?> metadata) {
        super(SubscriberGroupEntity.class, metadata);
    }

}

