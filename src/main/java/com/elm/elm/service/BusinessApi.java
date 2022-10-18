package com.elm.elm.service;

import com.elm.elm.dao.IBusinessDao;
import com.elm.elm.pojo.Business;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "商家管理相关接口")
@CrossOrigin(allowedHeaders = {"*"})
@RequestMapping(value = "/business")
//http://localhost:9091/spring/swagger-ui/index.html
public class BusinessApi {
    @Autowired
    private IBusinessDao businessDao;

    @GetMapping(value = "/query")
    @ApiOperation(value = "查询所有商家")
    public List<Business> queryBusinessList() {
        return businessDao.findAll();
    }

    @PostMapping(value = "/add")
    @ApiOperation(value = "添加商家")
    public boolean add(@RequestBody Business business) {
        try {
            businessDao.save(business);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
