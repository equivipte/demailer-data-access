package com.equivi.mailsy.data.entity;


public enum MailDeliveryStatus {

    PENDING(0),
    SUCCESS(1),
    FAILED(2);

    private Integer status;

    MailDeliveryStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
