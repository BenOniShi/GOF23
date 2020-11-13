package com.benonshi.builder;

/**
 * 建造者模式
 * 嫦娥飞船组建
 * @author BenOniShi
 * @date 2020/7/8 19:39
 */
public class ChangeDirectorAirShip implements DirectorAirShip {

    private AirShipBuilder builder;

    public ChangeDirectorAirShip(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        return builder
                .builderEngine()
                .builderEscapeTower()
                .builderOrbitalModule()
                .build();
    }
}
