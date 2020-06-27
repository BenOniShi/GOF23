package com.benonshi.factory.simplefactory;

/**
 * @author BenOniShi
 * @date 2020/6/27 7:21
 */
public class BenzCar extends Car {


    @Override
    public void start() {
        System.out.println(name + "启动了");
    }

    public BenzCar() {
        this.name = "Benz";
    }
}
