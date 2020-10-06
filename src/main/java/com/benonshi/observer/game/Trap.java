package com.benonshi.observer.game;

/**
 * @Author: BenOnSHI
 * @Date: 2020/10/4 13:01
 **/
public class Trap implements GameObserver {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("陷阱，掉血！");
        }
    }

    private boolean inRange() {
        return true;
    }
}
