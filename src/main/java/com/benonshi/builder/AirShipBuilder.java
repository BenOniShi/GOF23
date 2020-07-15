package com.benonshi.builder;

/**
 * @author BenOniShi
 * @date 2020/7/8 19:27
 */
public interface AirShipBuilder {

    AirShipBuilder builderEngine();

    AirShipBuilder builderOrbitalModule();

    AirShipBuilder builderEscapeTower();

    AirShip build();

}
