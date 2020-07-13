package com.benonshi.builder;

/**
 * @author BenOniShi
 * @date 2020/7/8 19:41
 */
public class Client {

    public static void main(String[] args) {
        DirectorAirShip changeDirectorAirShip = new ChangeDirectorAirShip(new ChangeAirShipBuilder());
        AirShip airShip = changeDirectorAirShip.directorAirShip();
    }
}
