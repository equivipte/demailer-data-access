package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSystemStateEntity is a Querydsl query type for SystemStateEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSystemStateEntity extends EntityPathBase<SystemStateEntity> {

    private static final long serialVersionUID = -1831417385L;

    public static final QSystemStateEntity systemStateEntity = new QSystemStateEntity("systemStateEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

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

    public final StringPath state_name = createString("state_name");

    public final StringPath state_value = createString("state_value");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QSystemStateEntity(String variable) {
        super(SystemStateEntity.class, forVariable(variable));
    }

    public QSystemStateEntity(Path<? extends SystemStateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemStateEntity(PathMetadata<?> metadata) {
        super(SystemStateEntity.class, metadata);
    }

}

