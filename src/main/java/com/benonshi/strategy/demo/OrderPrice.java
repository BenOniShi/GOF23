package com.benonshi.strategy.demo;

/**
 * @Author: BenOnSHI
 * @Date: 2020/7/31 12:29
 **/
public enum OrderPrice {
    ONE(5, 30),
    TWO(20, 15),
    THREE(50, 10),
    FOUR(100, 5);


    private int count;
    private int price;

    OrderPrice(int count, int price) {
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }
}
