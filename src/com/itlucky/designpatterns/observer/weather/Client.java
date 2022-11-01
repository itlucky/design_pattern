package com.itlucky.designpatterns.observer.weather;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 将接入方组合到气象站
        weatherData.setCurrentCondtions(new CurrentCondtions());

        weatherData.setData(22,35,52);

        System.out.println("-------------天气发生变化后-----------");

        weatherData.setData(33,45,66);
    }
}
