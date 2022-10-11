package com.elm.elm.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeliveryAddress {
    @Id
    private Integer daId;
    private String contactName;
    private Integer contactSex;
    private String contactTel;
    private String address;
    private String userId;

    public Integer getDaId() {
        return daId;
    }

    public void SetDaId(Integer daId) {
        this.daId = daId;
    }

    public String getContactName() {
        return contactName;
    }

    public void SetContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getContactSex() {
        return contactSex;
    }

    public void SetContactSex(Integer contactSex) {
        this.contactSex = contactSex;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void SetContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getAddress() {
        return address;
    }

    public void SetAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void SetUserId(String userId) {
        this.userId = userId;
    }
}