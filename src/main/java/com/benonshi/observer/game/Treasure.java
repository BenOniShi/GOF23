package com.benonshi.observer.game;

/**
 * @Author: BenOnSHI
 * @Date: 2020/10/4 13:00
 **/
public class Treasure implements GameObserver {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("宝物 ， 加血！");
        }
    }

    private boolean inRange() {
        return true;
    }
}
