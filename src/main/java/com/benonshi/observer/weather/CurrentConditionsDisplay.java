package com.benonshi.observer.weather;

/**
 * @Author: BenOnSHI
 * @Date: 2020/7/26 12:09
 **/
public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private WeatherData weatherData;

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压


    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度为：" + this.temperature + "℃");
        System.out.println("当前湿度为：" + this.humidity);
        System.out.println("当前气压为：" + this.pressure);
    }


    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }
}
