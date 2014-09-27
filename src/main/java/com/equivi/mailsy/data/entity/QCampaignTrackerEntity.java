package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCampaignTrackerEntity is a Querydsl query type for CampaignTrackerEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCampaignTrackerEntity extends EntityPathBase<CampaignTrackerEntity> {

    private static final long serialVersionUID = -1262092095L;

    public static final QCampaignTrackerEntity campaignTrackerEntity = new QCampaignTrackerEntity("campaignTrackerEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final BooleanPath bounced = createBoolean("bounced");

    public final DateTimePath<java.util.Date> bouncedDate = createDateTime("bouncedDate", java.util.Date.class);

    public final NumberPath<Long> campaignId = createNumber("campaignId", Long.class);

    public final StringPath campaignMailerMessageId = createString("campaignMailerMessageId");

    public final BooleanPath clicked = createBoolean("clicked");

    public final DateTimePath<java.util.Date> clickedDate = createDateTime("clickedDate", java.util.Date.class);

    public final StringPath clientDeviceName = createString("clientDeviceName");

    public final StringPath clientDeviceType = createString("clientDeviceType");

    public final StringPath clientOs = createString("clientOs");

    public final StringPath clientType = createString("clientType");

    public final StringPath clientUserAgent = createString("clientUserAgent");

    public final StringPath content = createString("content");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final BooleanPath delivered = createBoolean("delivered");

    public final StringPath geoLocationCity = createString("geoLocationCity");

    public final StringPath geoLocationCountry = createString("geoLocationCountry");

    public final StringPath geoLocationRegion = createString("geoLocationRegion");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final DateTimePath<java.util.Date> openDate = createDateTime("openDate", java.util.Date.class);

    public final BooleanPath opened = createBoolean("opened");

    public final StringPath recipient = createString("recipient");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QCampaignTrackerEntity(String variable) {
        super(CampaignTrackerEntity.class, forVariable(variable));
    }

    public QCampaignTrackerEntity(Path<? extends CampaignTrackerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCampaignTrackerEntity(PathMetadata<?> metadata) {
        super(CampaignTrackerEntity.class, metadata);
    }

}

