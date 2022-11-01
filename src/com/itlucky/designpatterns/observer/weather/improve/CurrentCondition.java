package com.itlucky.designpatterns.observer.weather.improve;

/**
 * 观察者
 */
public class CurrentCondition implements Observer{

    // 温度
    private float temperature;

    // 湿度
    private float humidity;

    //气压
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    //信息展示
    private void display() {
        System.out.println("=====接入1==当前的温度是："+this.temperature);
        System.out.println("=====接入1==当前的湿度是："+this.humidity);
        System.out.println("=====接入1==当前的气压是："+this.pressure);
    }

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
