package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTrackerEntity is a Querydsl query type for TrackerEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTrackerEntity extends EntityPathBase<TrackerEntity> {

    private static final long serialVersionUID = 1513270769L;

    public static final QTrackerEntity trackerEntity = new QTrackerEntity("trackerEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final NumberPath<Integer> emailSendCounter = createNumber("emailSendCounter", Integer.class);

    public final NumberPath<Integer> emailVerifierCounter = createNumber("emailVerifierCounter", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QTrackerEntity(String variable) {
        super(TrackerEntity.class, forVariable(variable));
    }

    public QTrackerEntity(Path<? extends TrackerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTrackerEntity(PathMetadata<?> metadata) {
        super(TrackerEntity.class, metadata);
    }

}

