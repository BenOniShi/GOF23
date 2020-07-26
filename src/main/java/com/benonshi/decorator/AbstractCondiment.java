package com.benonshi.decorator;

/**
 * 装饰类
 *
 * @author BenOniShi
 * @date 2020/7/16 23:45
 */
public abstract class AbstractCondiment extends AbstractBeverage {


    protected AbstractBeverage beverage;

    public AbstractCondiment(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost();
    }
}
