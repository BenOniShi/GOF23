package com.benonshi.builder;

/**
 * @author BenOniShi
 * @date 2020/7/8 19:27
 */
public interface AirShipBuilder {
    Engine builderEngine();

    OrbitalModule builderOrbitalModule();

    EscapeTower builderEscapeTower();

    AirShip build();

}
