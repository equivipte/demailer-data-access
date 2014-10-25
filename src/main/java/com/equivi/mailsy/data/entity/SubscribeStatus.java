package com.equivi.mailsy.data.entity;


public enum SubscribeStatus {

    SUBSCRIBED(0, "SUBSCRIBED"),
    UNSUBSCRIBED(1, "UNSUBSCRIBED");

    private Integer statusId;

    private String statusDescription;

    SubscribeStatus(final Integer userStatusId, final String userStatusDescription) {
        this.statusId = userStatusId;
        this.statusDescription = userStatusDescription;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }


    public static SubscribeStatus getStatusById(final Integer statusId) {
        for (SubscribeStatus userStatus : SubscribeStatus.values()) {
            if (userStatus.getStatusId().equals(statusId)) {
                return userStatus;
            }
        }
        return null;
    }

    public static SubscribeStatus getStatusByDescription(final String statusDescription) {
        for (SubscribeStatus status : SubscribeStatus.values()) {
            if (status.getStatusDescription().equals(statusDescription)) {
                return status;
            }
        }
        return null;
    }


}
