package com.equivi.mailsy.data.entity;


public enum UserStatus {

    ACTIVE(0, "ACTIVE"),
    INACTIVE(1, "INACTIVE"),
    LOCKED(2, "LOCKED");

    private Integer userStatusId;

    private String userStatusDescription;

    UserStatus(final Integer userStatusId, final String userStatusDescription) {
        this.userStatusId = userStatusId;
        this.userStatusDescription = userStatusDescription;
    }

    public Integer getUserStatusId() {
        return userStatusId;
    }

    public String getUserStatusDescription() {
        return userStatusDescription;
    }


    public static UserStatus getUserStatusById(final Integer userStatusId) {
        for (UserStatus userStatus : UserStatus.values()) {
            if (userStatus.getUserStatusId().equals(userStatusId)) {
                return userStatus;
            }
        }
        return null;
    }

    public static UserStatus getUserStatusByDescription(final String userStatusDescription) {
        for (UserStatus userStatus : UserStatus.values()) {
            if (userStatus.getUserStatusDescription().equals(userStatusDescription)) {
                return userStatus;
            }
        }
        return null;
    }


}
