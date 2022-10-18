package com.elm.elm;

import com.elm.elm.dao.IBusinessDao;
import com.elm.elm.pojo.Business;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BusinessDaoTest {

    @Autowired
    public IBusinessDao businessDao;

    @Test
    public void queryBusiness() {
        List<Business> businessList = businessDao.findAll();
        return;
    }

}
