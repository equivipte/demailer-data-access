package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cm01_campaign")
public class CampaignEntity extends AuditableEntity {
    private static final long serialVersionUID = 3147431369479751792L;

    @Column(name = "email_subject" ,length = 100)
    private String emaiSubject;

    @Column(name = "sender_name" ,length = 100)
    private String senderName;

    @Column(name = "sender_email" ,length = 255)
    private String senderEmail;

    @Column(name = "campaign_status")
    private CampaignStatus campaignStatus;


    public String getEmaiSubject() {
        return emaiSubject;
    }

    public void setEmaiSubject(String emaiSubject) {
        this.emaiSubject = emaiSubject;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public CampaignStatus getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus;
    }
}
