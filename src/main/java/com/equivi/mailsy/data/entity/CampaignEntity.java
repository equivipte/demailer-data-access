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

    @Column(name = "sender_name" ,length = 100)
    private String senderEmail;

    @Column(name = "campaign_status")
    private CampaignStatus campaignStatus;




}
