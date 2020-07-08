package com.benonshi.builder;

/**
 * @author BenOniShi
 * @date 2020/7/8 19:37
 */
public class ChangeAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("嫦娥发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("嫦娥轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸仓");
        return new EscapeTower("嫦娥逃逸仓");
    }
}
