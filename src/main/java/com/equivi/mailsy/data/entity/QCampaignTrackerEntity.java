package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCampaignTrackerEntity is a Querydsl query type for CampaignTrackerEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCampaignTrackerEntity extends EntityPathBase<CampaignTrackerEntity> {

    private static final long serialVersionUID = -1262092095L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCampaignTrackerEntity campaignTrackerEntity = new QCampaignTrackerEntity("campaignTrackerEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final DateTimePath<java.util.Date> bouncedDate = createDateTime("bouncedDate", java.util.Date.class);

    public final EnumPath<CampaignDeliveryStatus> campaignDeliveryStatus = createEnum("campaignDeliveryStatus", CampaignDeliveryStatus.class);

    public final QCampaignEntity campaignEntity;

    public final DateTimePath<java.util.Date> clickedDate = createDateTime("clickedDate", java.util.Date.class);

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

    public final DateTimePath<java.util.Date> openDate = createDateTime("openDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> sendDate = createDateTime("sendDate", java.util.Date.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCampaignTrackerEntity(String variable) {
        this(CampaignTrackerEntity.class, forVariable(variable), INITS);
    }

    public QCampaignTrackerEntity(Path<? extends CampaignTrackerEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCampaignTrackerEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCampaignTrackerEntity(PathMetadata<?> metadata, PathInits inits) {
        this(CampaignTrackerEntity.class, metadata, inits);
    }

    public QCampaignTrackerEntity(Class<? extends CampaignTrackerEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.campaignEntity = inits.isInitialized("campaignEntity") ? new QCampaignEntity(forProperty("campaignEntity")) : null;
        this.contactEntity = inits.isInitialized("contactEntity") ? new QContactEntity(forProperty("contactEntity")) : null;
    }

}

