package com.xckk.cloudalibabagoods8083.service.impl;

import com.xckk.cloudalibabagoods8083.mapper.GoodsMapper;
import com.xckk.cloudalibabagoods8083.service.FeignService;
import com.xckk.cloudalibabagoods8083.service.GoodsService;
import com.xckk.cloudalibabagoods8083.vo.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private FeignService feignService;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public String buyGoods() {


        // 下订单
        feignService.create("111111", "10000000000");

        int i = 10 / 0;
        GoodsInfo goodsInfo = new GoodsInfo("111111", "01", "购买一件商品");

        goodsMapper.addGoodsTable(goodsInfo);

        return "成功";
    }
}
