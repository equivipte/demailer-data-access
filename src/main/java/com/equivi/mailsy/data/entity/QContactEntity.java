package com.equivi.mailsy.data.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QContactEntity is a Querydsl query type for ContactEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContactEntity extends EntityPathBase<ContactEntity> {

    private static final long serialVersionUID = 71675097L;

    public static final QContactEntity contactEntity = new QContactEntity("contactEntity");

    public final QAuditableEntity _super = new QAuditableEntity(this);

    public final StringPath address1 = createString("address1");

    public final StringPath address2 = createString("address2");

    public final StringPath address3 = createString("address3");

    public final StringPath city = createString("city");

    public final StringPath companyName = createString("companyName");

    public final StringPath country = createString("country");

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDateTime = _super.createdDateTime;

    public final StringPath domainName = createString("domainName");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath facebookAccount = createString("facebookAccount");

    public final StringPath firstName = createString("firstName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastName = createString("lastName");

    //inherited
    public final NumberPath<Long> lastUpdatedBy = _super.lastUpdatedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastUpdatedDateTime = _super.lastUpdatedDateTime;

    public final StringPath pathAccount = createString("pathAccount");

    public final StringPath phone = createString("phone");

    public final EnumPath<SubscribeStatus> subscribeStatus = createEnum("subscribeStatus", SubscribeStatus.class);

    public final StringPath twitterAccount = createString("twitterAccount");

    //inherited
    public final NumberPath<Long> version = _super.version;

    public final StringPath zipCode = createString("zipCode");

    public QContactEntity(String variable) {
        super(ContactEntity.class, forVariable(variable));
    }

    public QContactEntity(Path<? extends ContactEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContactEntity(PathMetadata<?> metadata) {
        super(ContactEntity.class, metadata);
    }

}

