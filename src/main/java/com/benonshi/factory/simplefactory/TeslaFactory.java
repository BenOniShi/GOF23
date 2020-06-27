package com.benonshi.factory.simplefactory;

/**
 * @author BenOniShi
 * @date 2020/6/27 23:41
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new TeslaCar();
    }
}
