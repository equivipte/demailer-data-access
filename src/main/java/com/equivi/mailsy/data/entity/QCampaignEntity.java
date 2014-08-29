package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCampaignEntity is a Querydsl query type for CampaignEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCampaignEntity extends EntityPathBase<CampaignEntity> {

    private static final long serialVersionUID = -2084205795L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCampaignEntity campaignEntity = new QCampaignEntity("campaignEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath emailContent = createString("emailContent");

    public final StringPath emaiSubject = createString("emaiSubject");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final DateTimePath<java.util.Date> scheduledSendDate = createDateTime("scheduledSendDate", java.util.Date.class);

    public final QSubscriberGroupEntity subscriberGroupEntity;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCampaignEntity(String variable) {
        this(CampaignEntity.class, forVariable(variable), INITS);
    }

    public QCampaignEntity(Path<? extends CampaignEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCampaignEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCampaignEntity(PathMetadata<?> metadata, PathInits inits) {
        this(CampaignEntity.class, metadata, inits);
    }

    public QCampaignEntity(Class<? extends CampaignEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.subscriberGroupEntity = inits.isInitialized("subscriberGroupEntity") ? new QSubscriberGroupEntity(forProperty("subscriberGroupEntity")) : null;
    }

}

