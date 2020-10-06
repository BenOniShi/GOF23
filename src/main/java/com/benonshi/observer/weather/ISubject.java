package com.benonshi.observer.weather;

/**
 * 抽象主题
 * @Author: BenOnSHI
 * @Date: 2020/7/26 12:01
 **/
public interface ISubject {

    void registerObserver(IObserver observer);

    void removerObserver(IObserver observer);

    void notifyObservers();


}
