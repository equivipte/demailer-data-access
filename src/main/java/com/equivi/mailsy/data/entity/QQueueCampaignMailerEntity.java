package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QQueueCampaignMailerEntity is a Querydsl query type for QueueCampaignMailerEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QQueueCampaignMailerEntity extends EntityPathBase<QueueCampaignMailerEntity> {

    private static final long serialVersionUID = 1695059262L;

    public static final QQueueCampaignMailerEntity queueCampaignMailerEntity = new QQueueCampaignMailerEntity("queueCampaignMailerEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final NumberPath<Long> campaignId = createNumber("campaignId", Long.class);

    public final StringPath content = createString("content");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath emailFrom = createString("emailFrom");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final NumberPath<Integer> queueProcessed = createNumber("queueProcessed", Integer.class);

    public final StringPath recipient = createString("recipient");

    public final DateTimePath<java.util.Date> scheduledSendDate = createDateTime("scheduledSendDate", java.util.Date.class);

    public final StringPath subject = createString("subject");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QQueueCampaignMailerEntity(String variable) {
        super(QueueCampaignMailerEntity.class, forVariable(variable));
    }

    public QQueueCampaignMailerEntity(Path<? extends QueueCampaignMailerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQueueCampaignMailerEntity(PathMetadata<?> metadata) {
        super(QueueCampaignMailerEntity.class, metadata);
    }

}

