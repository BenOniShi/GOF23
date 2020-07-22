package com.benonshi.decorator;

/**
 * @author BenOniShi
 * @date 2020/7/23 1:01
 */
public class Sugar extends AbstractCondiment {


    public Sugar(AbstractBeverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 3;
    }
}
