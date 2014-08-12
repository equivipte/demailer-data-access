package com.equivi.mailsy.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ts02_subscriber")
public class SubscriberEntity extends AuditableEntity {
    private static final long serialVersionUID = 5741045255023992138L;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phone;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "domainName")
    private String domainName;

    @Column(name = "subscribeStatus")
    private SubscribeStatus subscribeStatus;

    @ManyToOne
    @JoinColumn(name = "subscribe_id")
    private SubscriberGroupEntity subscriberGroupEntity;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public SubscribeStatus getSubscribeStatus() {
        return subscribeStatus;
    }

    public void setSubscribeStatus(SubscribeStatus subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }


    public SubscriberGroupEntity getSubscriberGroupEntity() {
        return subscriberGroupEntity;
    }

    public void setSubscriberGroupEntity(SubscriberGroupEntity subscriberGroupEntity) {
        this.subscriberGroupEntity = subscriberGroupEntity;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
