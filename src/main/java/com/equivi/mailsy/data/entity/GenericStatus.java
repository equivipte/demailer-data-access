package com.equivi.mailsy.data.entity;


public enum GenericStatus {

    ACTIVE(0, "ACTIVE"),
    INACTIVE(1, "INACTIVE"),
    BLOCKED(2, "BLOCKED");

    private Integer statusId;

    private String statusDescription;

    GenericStatus(final Integer userStatusId, final String userStatusDescription) {
        this.statusId = userStatusId;
        this.statusDescription = userStatusDescription;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }


    public static GenericStatus getStatusById(final Integer statusId) {
        for (GenericStatus userStatus : GenericStatus.values()) {
            if (userStatus.getStatusId().equals(statusId)) {
                return userStatus;
            }
        }
        return null;
    }

    public static GenericStatus getStatusByDescription(final String statusDescription) {
        for (GenericStatus status : GenericStatus.values()) {
            if (status.getStatusDescription().equals(statusDescription)) {
                return status;
            }
        }
        return null;
    }


}
