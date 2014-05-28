package com.equivi.demailer.data.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(value = AuditEntityListener.class)
public class AuditableEntity extends BaseEntity {

    private static final long serialVersionUID = 4324007967870722572L;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "created_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    @Column(name = "last_updated_by")
    private Long lastUpdatedBy;

    @Column(name = "last_updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDateTime;


    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }
}
