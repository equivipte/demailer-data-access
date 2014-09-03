package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "cm01_campaign")
public class CampaignEntity extends AuditableEntity {
    private static final long serialVersionUID = 3147431369479751792L;

    @Column(name = "campaign_name", length = 100)
    private String campaignName;

    @Column(name = "email_subject", length = 100)
    private String emaiSubject;

    @Column(name = "email_content", length = 500)
    private String emailContent;

    @Column(name = "campaign_status", length = 1)
    private CampaignStatus campaignStatus;

    @Column(name = "scheduled_send_date")
    private Date scheduledSendDate;

    @OneToOne
    @JoinColumn(name = "subscriber_group_id")
    private SubscriberGroupEntity subscriberGroupEntity;


    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getEmaiSubject() {
        return emaiSubject;
    }

    public void setEmaiSubject(String emaiSubject) {
        this.emaiSubject = emaiSubject;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public Date getScheduledSendDate() {
        return scheduledSendDate;
    }

    public void setScheduledSendDate(Date scheduledSendDate) {
        this.scheduledSendDate = scheduledSendDate;
    }

    public SubscriberGroupEntity getSubscriberGroupEntity() {
        return subscriberGroupEntity;
    }

    public void setSubscriberGroupEntity(SubscriberGroupEntity subscriberGroupEntity) {
        this.subscriberGroupEntity = subscriberGroupEntity;
    }

    public CampaignStatus getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus;
    }
}
