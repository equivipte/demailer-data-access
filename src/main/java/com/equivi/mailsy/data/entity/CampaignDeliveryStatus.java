package com.equivi.mailsy.data.entity;


public enum CampaignDeliveryStatus {

    SEND(0, "SEND"),
    BOUNCED(1, "BOUNCED"),
    OPEN(2, "OPEN"),
    CLICKS(3, "CLICKS");

    private Integer statusId;

    private String statusDescription;

    CampaignDeliveryStatus(final Integer userStatusId, final String userStatusDescription) {
        this.statusId = userStatusId;
        this.statusDescription = userStatusDescription;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
}
