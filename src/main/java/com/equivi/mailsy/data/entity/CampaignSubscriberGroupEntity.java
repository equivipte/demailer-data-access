package com.equivi.mailsy.data.entity;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cm03_campaign_subscriber_group")
public class CampaignSubscriberGroupEntity extends AuditableEntity {

    private static final long serialVersionUID = -3055899100160829047L;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private CampaignEntity campaignEntity;

    @ManyToOne
    @JoinColumn(name = "subscriber_group_id")
    private SubscriberGroupEntity subscriberGroupEntity;


    public SubscriberGroupEntity getSubscriberGroupEntity() {
        return subscriberGroupEntity;
    }

    public void setSubscriberGroupEntity(SubscriberGroupEntity subscriberGroupEntity) {
        this.subscriberGroupEntity = subscriberGroupEntity;
    }

    public CampaignEntity getCampaignEntity() {
        return campaignEntity;
    }

    public void setCampaignEntity(CampaignEntity campaignEntity) {
        this.campaignEntity = campaignEntity;
    }
}
