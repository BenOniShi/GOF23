package com.benonshi.builder;

/**
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
        return builder.build();
    }
}
