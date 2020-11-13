package com.benonshi.builder;

/**
 * 阿波罗飞船组建
 * @author BenOniShi
 * @date 2020/7/15 21:04
 */
public class ApolloDirectorAirShip implements DirectorAirShip {

    private AirShipBuilder airShipBuilder;

    public ApolloDirectorAirShip(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directorAirShip() {
        return airShipBuilder
                .builderEngine()
                .builderOrbitalModule()
                .builderEscapeTower()
                .build();
    }
}
