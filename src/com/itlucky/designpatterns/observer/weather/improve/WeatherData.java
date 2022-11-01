package com.itlucky.designpatterns.observer.weather.improve;

import java.util.ArrayList;
import java.util.List;

/**
 *  核心类：
 *  1.包含最新的天气情况信息
 *  2.含有观察者集合，使用ArrayList管理
 *  3.当数据有更新时，就主动调用 ArrayList,通知所有的(接入方)就看到最新的消息。
 */
public class WeatherData implements Subject{

    // 温度
    private float temperature;

    // 湿度
    private float humidity;

    //气压
    private float pressure;

    // 观察者集合
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    // 当气象站观测到数据有变化时就调用setData方法更新数据
    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 将最新的数据推送给各个平台
        dataChange();
    }

    private void dataChange() {
        // 调用借入方update方法
//        currentCondtions.update(getTemperature(), getHumidity(), getPressure());
        notifyObservers();

    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        if(observer !=null){
            observers.add(observer);
        }
    }

    // 移除一个观察者
    @Override
    public void remove(Observer observer) {
        if(observer !=null){
            observers.remove(observer);
        }
    }

    // 遍历所有观察者，并通知
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(getTemperature(),getHumidity(),getPressure());
        });
    }

//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.pressure = pressure;
//
//        display();
//    }
//
//    private void display() {
//        System.out.println("=======当前的温度是："+this.temperature);
//        System.out.println("=======当前的湿度是："+this.humidity);
//        System.out.println("=======当前的气压是："+this.pressure);
//    }

    /**
     * 取得temperature的值
     *
     * @return temperature 的值
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * 设定temperature的值
     *
     * @param temperature 设定值
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     * 取得humidity的值
     *
     * @return humidity 的值
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * 设定humidity的值
     *
     * @param humidity 设定值
     */
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    /**
     * 取得pressure的值
     *
     * @return pressure 的值
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * 设定pressure的值
     *
     * @param pressure 设定值
     */
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

}
