package com.benonshi.observer.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: BenOnSHI
 * @Date: 2020/10/4 13:02
 **/
public class Hero implements ISubject {
    List<GameObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(GameObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(GameObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(GameObserver::update);
    }


    void move() {
        System.out.println("正在移动-------");
        notifyObservers();
    }
}
