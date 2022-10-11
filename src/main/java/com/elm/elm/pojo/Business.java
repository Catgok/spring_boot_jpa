package com.elm.elm.pojo;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
public class Business {
    @Id
    private Integer businessId;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private String businessImg;
    private Integer orderTypeId;
    private double starPrice; //起送费
    private double deliveryPrice; //配送费
    private String remarks;

    //    @OneToMany(mappedBy = "cart", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "business", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Cart> carts;

    //    @OneToMany(mappedBy = "order", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "business", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Orders> orders;

    public List<Cart> getCarts() {
        return carts;
    }

    public void SetCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void SetOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void SetBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void SetBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void SetBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public void SetBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public String getBusinessImg() {
        return businessImg;
    }

    public void SetBusinessImg(String businessImg) {
        this.businessImg = businessImg;
    }

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public void SetOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public double getStarPrice() {
        return starPrice;
    }

    public void SetStarPrice(double starPrice) {
        this.starPrice = starPrice;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void SetDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void SetRemarks(String remarks) {
        this.remarks = remarks;
    }
}
