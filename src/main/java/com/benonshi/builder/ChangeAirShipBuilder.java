package com.benonshi.builder;

/**
 * 建造者模式
 * 嫦娥建造者类
 * @author BenOniShi
 * @date 2020/7/8 19:37
 */
public class ChangeAirShipBuilder implements AirShipBuilder {

    private AirShip airShip;

    public ChangeAirShipBuilder(AirShip airShip) {
        this.airShip = airShip;
    }

    @Override
    public AirShipBuilder builderEngine() {
        airShip.setEngine(new Engine("嫦娥"));
        return this;
    }

    @Override
    public AirShipBuilder builderOrbitalModule() {
        airShip.setOrbitalModule(new OrbitalModule("嫦娥"));
        return this;
    }

    @Override
    public AirShipBuilder builderEscapeTower() {
        airShip.setEscapeTower(new EscapeTower("嫦娥"));
        return this;
    }

    @Override
    public AirShip build() {
        return airShip;
    }
}
