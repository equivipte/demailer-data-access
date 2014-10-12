package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "qcm01_campaign_queue_mailer")
public class QueueCampaignMailerEntity extends AuditableEntity {

    private static final long serialVersionUID = 6437425850178204238L;

    @Column(name = "campaign_id")
    private Long campaignId;

    @Column(name = "email_from", length = 50)
    private String emailFrom;

    @Column(name = "recipient", length = 50)
    private String recipient;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    @Column(name = "scheduled_send_date")
    private Date scheduledSendDate;

    @Column(name = "queue_processed", length = 1)
    private int queueProcessed;


    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Date getScheduledSendDate() {
        return scheduledSendDate;
    }

    public void setScheduledSendDate(Date scheduledSendDate) {
        this.scheduledSendDate = scheduledSendDate;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQueueProcessed() {
        return queueProcessed;
    }

    public void setQueueProcessed(int queueProcessed) {
        this.queueProcessed = queueProcessed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueueCampaignMailerEntity that = (QueueCampaignMailerEntity) o;

        if (campaignId.equals(that.campaignId) && recipient.equals(that.recipient)) return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = campaignId.hashCode();
        result = 31 * result + recipient.hashCode();
        return result;
    }
}
