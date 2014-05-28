package com.equivi.demailer.data.entity;


public enum MerchantStatus {

    ACTIVE(0, "ACTIVE"),
    INACTIVE(1, "INACTIVE");

    private Integer merchantStatusId;

    private String merchantStatusDescription;

    MerchantStatus(final Integer userStatusId, final String merchantStatusDescription) {
        this.merchantStatusId = userStatusId;
        this.merchantStatusDescription = merchantStatusDescription;
    }

    public static MerchantStatus getMerchantStatusById(final Integer userStatusId) {
        for (MerchantStatus userStatus : MerchantStatus.values()) {
            if (userStatus.getMerchantStatusId().equals(userStatusId)) {
                return userStatus;
            }
        }
        return null;
    }

    public static MerchantStatus getMerchantStatusByDescription(final String userStatusDescription) {
        for (MerchantStatus userStatus : MerchantStatus.values()) {
            if (userStatus.getMerchantStatusDescription().equals(userStatusDescription)) {
                return userStatus;
            }
        }
        return null;
    }

    public Integer getMerchantStatusId() {
        return merchantStatusId;
    }

    public String getMerchantStatusDescription() {
        return merchantStatusDescription;
    }


}
