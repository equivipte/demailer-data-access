package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "cm02_campaign_tracker")
public class CampaignTrackerEntity {

    private static final long serialVersionUID = 6437425850178204238L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "campaign_mailer_message_id")
    private String campaignMailerMessageId;

    @Column(name = "campaign_id")
    private Long campaignId;

    @Column(name = "recipient")
    private String recipient;

    @Column(name = "client_device_name")
    private String clientDeviceName;

    @Column(name = "client_os")
    private String clientOs;

    @Column(name = "client_user_agent")
    private String clientUserAgent;

    @Column(name = "client_device_type")
    private String clientDeviceType;

    @Column(name = "client_type")
    private String clientType;

    @Column(name = "delivered")
    private boolean delivered;

    @Column(name = "clicked")
    private boolean clicked;

    @Column(name = "opened")
    private boolean opened;

    @Column(name = "bounced")
    private boolean bounced;

    @Column(name = "unsubscribed")
    private boolean unsubscribed;

    @Column(name = "geo_location_city")
    private String geoLocationCity;

    @Column(name = "geo_location_region")
    private String geoLocationRegion;

    @Column(name = "geo_location_country")
    private String geoLocationCountry;

    @Column(name = "deliver_date")
    private Date deliverDate;

    @Column(name = "open_date")
    private Date openDate;

    @Column(name = "clicked_date")
    private Date clickedDate;

    @Column(name = "bounced_date")
    private Date bouncedDate;

    @Column(name = "unsubscribed_date")
    private Date unsubscribedDate;

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

    public String getCampaignMailerMessageId() {
        return campaignMailerMessageId;
    }

    public void setCampaignMailerMessageId(String campaignMailerMessageId) {
        this.campaignMailerMessageId = campaignMailerMessageId;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getClientDeviceName() {
        return clientDeviceName;
    }

    public void setClientDeviceName(String clientDeviceName) {
        this.clientDeviceName = clientDeviceName;
    }

    public String getClientOs() {
        return clientOs;
    }

    public void setClientOs(String clientOs) {
        this.clientOs = clientOs;
    }

    public String getClientUserAgent() {
        return clientUserAgent;
    }

    public void setClientUserAgent(String clientUserAgent) {
        this.clientUserAgent = clientUserAgent;
    }

    public String getClientDeviceType() {
        return clientDeviceType;
    }

    public void setClientDeviceType(String clientDeviceType) {
        this.clientDeviceType = clientDeviceType;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isBounced() {
        return bounced;
    }

    public void setBounced(boolean bounced) {
        this.bounced = bounced;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getClickedDate() {
        return clickedDate;
    }

    public void setClickedDate(Date clickedDate) {
        this.clickedDate = clickedDate;
    }

    public Date getBouncedDate() {
        return bouncedDate;
    }

    public void setBouncedDate(Date bouncedDate) {
        this.bouncedDate = bouncedDate;
    }

    public String getGeoLocationCity() {
        return geoLocationCity;
    }

    public void setGeoLocationCity(String geoLocationCity) {
        this.geoLocationCity = geoLocationCity;
    }

    public String getGeoLocationRegion() {
        return geoLocationRegion;
    }

    public void setGeoLocationRegion(String geoLocationRegion) {
        this.geoLocationRegion = geoLocationRegion;
    }

    public String getGeoLocationCountry() {
        return geoLocationCountry;
    }

    public void setGeoLocationCountry(String geoLocationCountry) {
        this.geoLocationCountry = geoLocationCountry;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isUnsubscribed() {
        return unsubscribed;
    }

    public void setUnsubscribed(boolean unsubscribed) {
        this.unsubscribed = unsubscribed;
    }

    public Date getUnsubscribedDate() {
        return unsubscribedDate;
    }

    public void setUnsubscribedDate(Date unsubscribedDate) {
        this.unsubscribedDate = unsubscribedDate;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
