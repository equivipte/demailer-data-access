package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "cm02_campaign_tracker")
public class CampaignTrackerEntity extends AuditableEntity {

    private static final long serialVersionUID = 6437425850178204238L;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private ContactEntity contactEntity;

    @OneToOne
    @JoinColumn(name = "campaign_id")
    private CampaignEntity campaignEntity;

    @Column(name = "campaign_delivery_status")
    private CampaignDeliveryStatus campaignDeliveryStatus;

    @Column(name = "send_date")
    private Date sendDate;

    @Column(name = "open_date")
    private Date openDate;

    @Column(name = "clicked_date")
    private Date clickedDate;

    @Column(name = "bounced_date")
    private Date bouncedDate;


    public CampaignEntity getCampaignEntity() {
        return campaignEntity;
    }

    public void setCampaignEntity(CampaignEntity campaignEntity) {
        this.campaignEntity = campaignEntity;
    }

    public ContactEntity getContactEntity() {
        return contactEntity;
    }

    public void setContactEntity(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
    }

    public CampaignDeliveryStatus getCampaignDeliveryStatus() {
        return campaignDeliveryStatus;
    }

    public void setCampaignDeliveryStatus(CampaignDeliveryStatus campaignDeliveryStatus) {
        this.campaignDeliveryStatus = campaignDeliveryStatus;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getBouncedDate() {
        return bouncedDate;
    }

    public void setBouncedDate(Date bouncedDate) {
        this.bouncedDate = bouncedDate;
    }

    public Date getClickedDate() {
        return clickedDate;
    }

    public void setClickedDate(Date clickedDate) {
        this.clickedDate = clickedDate;
    }
}
