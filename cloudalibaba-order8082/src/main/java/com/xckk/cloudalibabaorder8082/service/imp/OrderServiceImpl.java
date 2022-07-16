package com.xckk.cloudalibabaorder8082.service.imp;

import com.xckk.cloudalibabaorder8082.mapper.OrderMapper;
import com.xckk.cloudalibabaorder8082.service.OrderService;
import com.xckk.cloudalibabaorder8082.vo.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void create(OrderInfo orderInfo) {
//        OrderInfo orderInfo = new OrderInfo("100", "2222");
        orderMapper.addOrder(orderInfo);
    }
}
