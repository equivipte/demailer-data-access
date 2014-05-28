package com.equivi.demailer.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


@Entity
@Table(name = "usr01_user")
public class UserEntity extends AuditableEntity {

    private static final long serialVersionUID = 6566046218970861563L;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "reset_password_required")
    private boolean resetPasswordRequired;

    @Column(name = "user_role")
    @Enumerated(EnumType.ORDINAL)
    private UserRole userRole;

    @Column(name = "user_status")
    @Enumerated(EnumType.ORDINAL)
    private UserStatus userStatus;

    @Column(name = "failed_login_counter")
    private Integer failedLoginCounter;

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isResetPasswordRequired() {
        return resetPasswordRequired;
    }

    public void setResetPasswordRequired(boolean resetPasswordRequired) {
        this.resetPasswordRequired = resetPasswordRequired;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getFailedLoginCounter() {
        return failedLoginCounter;
    }

    public void setFailedLoginCounter(Integer failedLoginCounter) {
        this.failedLoginCounter = failedLoginCounter;
    }
}
