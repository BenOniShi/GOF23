package com.benonshi.observer.game;

/**
 * 抽象主题
 * @Author: BenOnSHI
 * @Date: 2020/7/26 12:01
 **/
public interface ISubject {

    void registerObserver(GameObserver observer);

    void removerObserver(GameObserver observer);

    void notifyObservers();


}
