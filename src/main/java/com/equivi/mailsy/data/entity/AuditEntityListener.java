package com.equivi.mailsy.data.entity;


import org.joda.time.DateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class AuditEntityListener {

    @PrePersist
    public void prePersist(AuditableEntity auditableEntity) {

        //auditableEntity.setCreatedBy(UserContext.get().getUserId());
        auditableEntity.setCreatedDateTime(new DateTime().toDate());

    }

    @PreUpdate
    public void preUpdate(AuditableEntity auditableEntity) {
        //auditableEntity.setLastUpdatedBy(userLoginDTO.getUserId());
        auditableEntity.setLastUpdatedDateTime(new DateTime().toDate());
    }
}
