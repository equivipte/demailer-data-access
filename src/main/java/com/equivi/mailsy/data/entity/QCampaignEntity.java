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

    public static final QCampaignEntity campaignEntity = new QCampaignEntity("campaignEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final StringPath campaignName = createString("campaignName");

    public final EnumPath<CampaignStatus> campaignStatus = createEnum("campaignStatus", CampaignStatus.class);

    public final ListPath<CampaignSubscriberGroupEntity, QCampaignSubscriberGroupEntity> campaignSubscriberGroupEntities = this.<CampaignSubscriberGroupEntity, QCampaignSubscriberGroupEntity>createList("campaignSubscriberGroupEntities", CampaignSubscriberGroupEntity.class, QCampaignSubscriberGroupEntity.class, PathInits.DIRECT2);

    public final StringPath campaignUUID = createString("campaignUUID");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath emailContent = createString("emailContent");

    public final StringPath emailFrom = createString("emailFrom");

    public final StringPath emailSubject = createString("emailSubject");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final DateTimePath<java.util.Date> scheduledSendDate = createDateTime("scheduledSendDate", java.util.Date.class);

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCampaignEntity(String variable) {
        super(CampaignEntity.class, forVariable(variable));
    }

    public QCampaignEntity(Path<? extends CampaignEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCampaignEntity(PathMetadata<?> metadata) {
        super(CampaignEntity.class, metadata);
    }

}

