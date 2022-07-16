package com.xckk.cloudalibabagoods8083.vo;

public class GoodsInfo {

    private String amount;
    private String goodsType;
    private String goodsInfo;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public GoodsInfo(String amount, String goodsType, String goodsInfo) {
        this.amount = amount;
        this.goodsType = goodsType;
        this.goodsInfo = goodsInfo;
    }
}
