package com.benonshi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: BenOnSHI
 * @Date: 2020/7/26 12:03
 **/
public class WeatherData implements ISubject {
    private List<IObserver> observers;
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float pressure;
    //未来几天的温度
    private List<Float> forecastTemperatures;


    public WeatherData() {
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removerObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity,
                                float pressure, List<Float> forecastTemperatures) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        measurementsChanged();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }
}
