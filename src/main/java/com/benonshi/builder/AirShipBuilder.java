package com.benonshi.builder;

/**
 * 建造者模式
 * 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作
 * 其通常由各个部分的子对象用一定的算法构成；由于需求的变化
 * 这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 * @author BenOniShi
 * @date 2020/7/8 19:27
 */
public interface AirShipBuilder {

    AirShipBuilder builderEngine();

    AirShipBuilder builderOrbitalModule();

    AirShipBuilder builderEscapeTower();

    AirShip build();

}
