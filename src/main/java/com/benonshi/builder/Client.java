package com.benonshi.builder;

/**
 * @author BenOniShi
 * @date 2020/7/8 19:41
 */
public class Client {

    public static void main(String[] args) {
        DirectorAirShip changeDirectorAirShip = new ChangeDirectorAirShip(new ChangeAirShipBuilder(new AirShip()));
        AirShip changeAirShip = changeDirectorAirShip.directorAirShip();
        System.out.println(changeAirShip.getOrbitalModule().getName());
        DirectorAirShip apolloDirectorAirShip = new ApolloDirectorAirShip(new ApolloAirShipBuilder(new AirShip()));
        AirShip apolloAirShip = apolloDirectorAirShip.directorAirShip();
        System.out.println(apolloAirShip.getOrbitalModule().getName());
    }
}
