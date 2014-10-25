package com.equivi.mailsy.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t01_tracker")
public class TrackerEntity extends AuditableEntity {


    private static final long serialVersionUID = 3199489664688250979L;

    @Column(name = "email_send_counter")
    private Integer emailSendCounter;

    @Column(name = "email_verifier_counter")
    private Integer emailVerifierCounter;

    public Integer getEmailSendCounter() {
        return emailSendCounter;
    }

    public void setEmailSendCounter(Integer emailSendCounter) {
        this.emailSendCounter = emailSendCounter;
    }

    public Integer getEmailVerifierCounter() {
        return emailVerifierCounter;
    }

    public void setEmailVerifierCounter(Integer emailVerifierCounter) {
        this.emailVerifierCounter = emailVerifierCounter;
    }
}
