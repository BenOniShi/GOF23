package com.benonshi.factory.simplefactory;

/**
 * @author BenOniShi
 * @date 2020/6/27 7:22
 */
public class TeslaCar extends Car {


    @Override
    public void start() {
        System.out.println(name + "启动了");
    }

    public TeslaCar() {
        this.name = "Tesla";
    }
}
