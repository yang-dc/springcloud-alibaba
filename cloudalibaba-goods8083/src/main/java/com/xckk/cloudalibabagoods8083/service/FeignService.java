package com.xckk.cloudalibabagoods8083.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "cloudalibaba-order8082")
public interface FeignService {

    @GetMapping("/order/create")
    public String create(@RequestParam("orderAmount") String amount, @RequestParam("goodsId") String goodsId);
}
