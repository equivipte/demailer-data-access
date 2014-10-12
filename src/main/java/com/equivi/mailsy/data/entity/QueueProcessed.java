package com.equivi.mailsy.data.entity;


public enum QueueProcessed {

    PENDING(0),
    SUCCESS(1),
    FAILED(2);

    private Integer status;

    QueueProcessed(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
