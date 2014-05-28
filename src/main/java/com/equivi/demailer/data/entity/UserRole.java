package com.equivi.demailer.data.entity;


import java.util.Arrays;
import java.util.List;

public enum UserRole {

    SUPER_ADMIN_ROLE(0, "SUPER_ADMIN_ROLE"),
    MCD_ADMIN_USER(1, "MCD_ADMIN_USER");

    private Integer roleId;

    private String roleDescription;

    UserRole(Integer roleId, String roleDescription) {
        this.roleId = roleId;
        this.roleDescription = roleDescription;
    }

    public static UserRole getUserRoleById(final Integer userRoleId) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.getRoleId().equals(userRoleId)) {
                return userRole;
            }
        }
        return null;
    }

    public static UserRole getUserRoleByDescription(final String userRoleDescription) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.getRoleDescription().equalsIgnoreCase(userRoleDescription)) {
                return userRole;
            }
        }
        return null;
    }

    public static List<UserRole> list() {
        return Arrays.asList(values());
    }

    public Integer getRoleId() {
        return roleId;
    }

    public String getRoleDescription() {
        return roleDescription;
    }
}
