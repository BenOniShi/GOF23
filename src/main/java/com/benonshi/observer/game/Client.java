package com.benonshi.observer.game;

/**
 * @Author: BenOnSHI
 * @Date: 2020/10/4 13:06
 **/
public class Client {

    public static void main(String[] args) {
        Hero hero = new Hero();
        Trap trap = new Trap();
        hero.registerObserver(trap);
        hero.move();
        Treasure treasure = new Treasure();
        hero.registerObserver(treasure);
        hero.move();
    }
}
