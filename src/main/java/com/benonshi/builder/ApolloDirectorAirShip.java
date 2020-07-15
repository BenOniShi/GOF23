package com.benonshi.builder;

/**
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
