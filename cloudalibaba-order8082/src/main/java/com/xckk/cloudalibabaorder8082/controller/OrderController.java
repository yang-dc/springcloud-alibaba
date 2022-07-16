package com.xckk.cloudalibabaorder8082.controller;

import com.xckk.cloudalibabaorder8082.service.OrderService;
import com.xckk.cloudalibabaorder8082.vo.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public String create(@RequestParam("orderAmount") String amount, @RequestParam("goodsId") String goodsId){
        OrderInfo orderInfo = new OrderInfo(amount, goodsId);
        orderService.create(orderInfo);
        return "生成订单";
    }
}
