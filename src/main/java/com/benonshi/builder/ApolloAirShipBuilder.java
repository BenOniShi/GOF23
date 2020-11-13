package com.benonshi.builder;

/**
 * 建造者模式
 * 阿波罗建造者类
 * @author BenOniShi
 * @date 2020/7/15 21:02
 */
public class ApolloAirShipBuilder implements AirShipBuilder {
    /**
     * 建造者模式builder类 用来规范产品的组建 注入建造对象
     *
     * builder方法建造
     */
    private AirShip airShip;

    public ApolloAirShipBuilder(AirShip airShip) {
        this.airShip = airShip;
    }

    @Override
    public AirShipBuilder builderEngine() {
        airShip.setEngine(new Engine("阿波罗"));
        return this;
    }

    @Override
    public AirShipBuilder builderOrbitalModule() {
        airShip.setOrbitalModule(new OrbitalModule("阿波罗"));
        return this;
    }

    @Override
    public AirShipBuilder builderEscapeTower() {
        airShip.setEscapeTower(new EscapeTower("阿波罗"));
        return this;
    }

    @Override
    public AirShip build() {
        return airShip;
    }
}
