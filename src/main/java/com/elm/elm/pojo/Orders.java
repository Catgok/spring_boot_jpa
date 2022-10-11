package com.elm.elm.pojo;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {
    @Id
    private Integer orderId;
    private String userId;
    private Integer businessId;
    private String orderDate;
    private Double orderTotal;
    private Integer daId; //送货地址编号
    private Integer orderState; //订单状态（0：未支付； 1：已支付）

    //多对一：所属商家
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "businessId", insertable = false, updatable = false)
    private Business business;
    //一对多：订单明细

    //@OneToMany(mappedBy = "OrderDetailet", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "orders", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<OrderDetailet> orderDetailets;


    public void SetBusiness(Business business) {
        this.business = business;
    }

    public List<OrderDetailet> getOrderDetailets() {
        return orderDetailets;
    }

    public void SetOrderDetailets(List<OrderDetailet> List) {
        this.orderDetailets = List;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void SetOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void SetUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void SetBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void SetOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void SetOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Integer getDaId() {
        return daId;
    }

    public void SetDaId(Integer daId) {
        this.daId = daId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void SetOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Business getBusiness() {
        return business;
    }

}
