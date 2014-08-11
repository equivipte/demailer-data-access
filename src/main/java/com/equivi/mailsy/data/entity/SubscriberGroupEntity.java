package com.equivi.mailsy.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ts01_subscriber_group")
public class SubscriberGroupEntity extends AuditableEntity {

    private static final long serialVersionUID = -6998128368516293597L;

    @Column(name = "group_name", length = 255)
    private String groupName;

    @OneToMany
    @JoinColumn(name = "subscribe_id")
    private List<SubscriberEntity> subscribeEntityList;

    @Column(name = "status", length = 2)
    private GenericStatus status;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<SubscriberEntity> getSubscribeEntityList() {
        return subscribeEntityList;
    }

    public void setSubscribeEntityList(List<SubscriberEntity> subscribeEntityList) {
        this.subscribeEntityList = subscribeEntityList;
    }

    public GenericStatus getStatus() {
        return status;
    }

    public void setStatus(GenericStatus status) {
        this.status = status;
    }
}
