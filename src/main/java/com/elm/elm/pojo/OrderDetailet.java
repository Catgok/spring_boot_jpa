package com.elm.elm.pojo;

import javax.persistence.*;

@Entity
public class OrderDetailet {
    @Id
    private Integer odId;
    private Integer orderId;
    private Integer foodId;
    private Integer quantity;
    //多对一：所属食品
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "orderId", insertable = false, updatable = false)
    private Orders orders;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "foodId", insertable = false, updatable = false)
    private Food food;

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
