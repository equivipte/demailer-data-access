package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "q01_quota")
public class QuotaEntity extends AuditableEntity {
    @Column(name = "email_verify_quota")
    private long emailVerifyQuota;

    @Column(name = "email_sending_quota")
    private long emailSendingQuota;

    @Column(name = "current_emails_verified")
    private long currentEmailsVerified;

    @Column(name = "current_emails_sent")
    private long currentEmailsSent;

    public long getEmailVerifyQuota() {
        return emailVerifyQuota;
    }

    public void setEmailVerifyQuota(long emailVerifyQuota) {
        this.emailVerifyQuota = emailVerifyQuota;
    }

    public long getEmailSendingQuota() {
        return emailSendingQuota;
    }

    public void setEmailSendingQuota(long emailSendingQuota) {
        this.emailSendingQuota = emailSendingQuota;
    }

    public long getCurrentEmailsVerified() {
        return currentEmailsVerified;
    }

    public void setCurrentEmailsVerified(long currentEmailsVerified) {
        this.currentEmailsVerified = currentEmailsVerified;
    }

    public long getCurrentEmailsSent() {
        return currentEmailsSent;
    }

    public void setCurrentEmailsSent(long currentEmailsSent) {
        this.currentEmailsSent = currentEmailsSent;
    }
}
