package com.benonshi.decorator;

/**
 * @author BenOniShi
 * @date 2020/7/16 23:47
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Beverage();
        Milk milk = new Milk(beverage);
        Sugar sugar = new Sugar(milk);
        System.out.println(sugar.cost());
        Milk milk1 = new Milk(sugar);
        System.out.println(milk1.cost());
    }
}
