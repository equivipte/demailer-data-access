package com.equivi.mailsy.data.entity;

public enum CampaignStatus {

    DRAFT(0, "DRAFT"),
    SEND(1, "SEND");

    private Integer campaignStatusId;

    private String campaignStatusDescription;

    CampaignStatus(Integer campaignStatusId, String campaignStatusDescription) {
        this.campaignStatusId = campaignStatusId;
        this.campaignStatusDescription = campaignStatusDescription;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
