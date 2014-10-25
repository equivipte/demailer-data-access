package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCampaignSubscriberGroupEntity is a Querydsl query type for CampaignSubscriberGroupEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCampaignSubscriberGroupEntity extends EntityPathBase<CampaignSubscriberGroupEntity> {

    private static final long serialVersionUID = -1560415424L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCampaignSubscriberGroupEntity campaignSubscriberGroupEntity = new QCampaignSubscriberGroupEntity("campaignSubscriberGroupEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final QCampaignEntity campaignEntity;

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

    public QCampaignSubscriberGroupEntity(String variable) {
        this(CampaignSubscriberGroupEntity.class, forVariable(variable), INITS);
    }

    public QCampaignSubscriberGroupEntity(Path<? extends CampaignSubscriberGroupEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCampaignSubscriberGroupEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCampaignSubscriberGroupEntity(PathMetadata<?> metadata, PathInits inits) {
        this(CampaignSubscriberGroupEntity.class, metadata, inits);
    }

    public QCampaignSubscriberGroupEntity(Class<? extends CampaignSubscriberGroupEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.campaignEntity = inits.isInitialized("campaignEntity") ? new QCampaignEntity(forProperty("campaignEntity")) : null;
        this.subscriberGroupEntity = inits.isInitialized("subscriberGroupEntity") ? new QSubscriberGroupEntity(forProperty("subscriberGroupEntity")) : null;
    }

}

