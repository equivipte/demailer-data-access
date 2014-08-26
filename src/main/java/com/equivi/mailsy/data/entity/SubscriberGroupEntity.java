package com.equivi.mailsy.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscribe_id")
    private List<SubscriberContactEntity> subscribeContactEntityList;

    @Column(name = "status", length = 2)
    private GenericStatus status;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<SubscriberContactEntity> getSubscribeContactEntityList() {
        return subscribeContactEntityList;
    }

    public void setSubscribeContactEntityList(List<SubscriberContactEntity> subscribeContactEntityList) {
        this.subscribeContactEntityList = subscribeContactEntityList;
    }

    public GenericStatus getStatus() {
        return status;
    }

    public void setStatus(GenericStatus status) {
        this.status = status;
    }
}
