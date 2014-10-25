package com.equivi.mailsy.data.entity;

public enum CampaignStatus {

    DRAFT(0, "DRAFT"),
    OUTBOX(1, "OUTBOX"),
    SEND(2, "SEND");

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

    public Integer getCampaignStatusId() {
        return campaignStatusId;
    }

    public void setCampaignStatusId(Integer campaignStatusId) {
        this.campaignStatusId = campaignStatusId;
    }

    public String getCampaignStatusDescription() {
        return campaignStatusDescription;
    }

    public void setCampaignStatusDescription(String campaignStatusDescription) {
        this.campaignStatusDescription = campaignStatusDescription;
    }

    public static CampaignStatus getStatusById(final Integer statusId) {
        for (CampaignStatus campaignStatus : CampaignStatus.values()) {
            if (campaignStatus.getCampaignStatusId().equals(statusId)) {
                return campaignStatus;
            }
        }
        return null;
    }

    public static CampaignStatus getStatusByDescription(final String statusDescription) {
        for (CampaignStatus campaignStatus : CampaignStatus.values()) {
            if (campaignStatus.getCampaignStatusDescription().equals(statusDescription)) {
                return campaignStatus;
            }
        }
        return null;
    }
}
