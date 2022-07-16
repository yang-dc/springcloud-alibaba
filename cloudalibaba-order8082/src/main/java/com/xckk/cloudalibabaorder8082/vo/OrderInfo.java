package com.xckk.cloudalibabaorder8082.vo;

public class OrderInfo {
    private String amount;
    private String goodsId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public OrderInfo(String amount, String goodsId) {
        this.amount = amount;
        this.goodsId = goodsId;
    }
}
