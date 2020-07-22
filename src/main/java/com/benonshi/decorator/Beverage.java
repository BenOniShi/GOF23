package com.benonshi.decorator;

/**
 * @author BenOniShi
 * @date 2020/7/23 1:04
 */
public class Beverage extends AbstractBeverage {

    @Override
    public int cost() {
        return super.price;
    }
}
