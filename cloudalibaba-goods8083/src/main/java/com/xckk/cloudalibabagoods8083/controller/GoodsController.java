package com.xckk.cloudalibabagoods8083.controller;

import com.xckk.cloudalibabagoods8083.service.GoodsService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("buyGoods")
    @GlobalTransactional        // 开启at全局事务
    public String buyGoods() {
        return goodsService.buyGoods();
    }
}
