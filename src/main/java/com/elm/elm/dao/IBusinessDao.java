package com.elm.elm.dao;

import com.elm.elm.pojo.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBusinessDao extends JpaRepository<Business, Integer> {
    Business findByBusinessName(String name);
}
