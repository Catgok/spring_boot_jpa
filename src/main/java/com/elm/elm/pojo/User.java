package com.elm.elm.pojo;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private String userId;
    private String password;
    private String userName;
    private Integer userSex;
    private String userImg;
    private Integer delTag;

    //@OneToMany(mappedBy = "Cart", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Cart> carts;

    public List<Cart> getCarts() {
        return carts;
    }

    public void SetCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public String getUserId() {
        return userId;
    }

    public void SetUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void SetPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void SetUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void SetUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserImg() {
        return userImg;
    }

    public void SetUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Integer getDelTag() {
        return delTag;
    }

    public void SetDelTag(Integer delTag) {
        this.delTag = delTag;
    }
}