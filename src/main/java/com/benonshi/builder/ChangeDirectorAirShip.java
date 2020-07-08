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
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
