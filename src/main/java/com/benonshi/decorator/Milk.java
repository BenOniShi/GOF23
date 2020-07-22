package com.benonshi.decorator;

/**
 * 被装饰类
 *
 * @author BenOniShi
 * @date 2020/7/16 23:46
 */
public class Milk extends AbstractCondiment {


    public Milk(AbstractBeverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
}
