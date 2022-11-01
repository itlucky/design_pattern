package com.itlucky.designpatterns.observer.weather;

/**
 * 核心类：
 * 1.包含最新的天气情况信息
 * 2.含有 CurrentCondtions 对象
 * 3.当数据有更新时，就主动调用 CurrentCondtions 对象的update方法（含display），
 *   这样他们(接入方)就能看到最新的数据
 *
 * 天气气象站的数据，如果气象站观测的数据有变化，需要推送到各个接入的平台用来展示。
 *
 * 分析：
 * 如果在增加N个接入方，
 * 就得创建N个第三方接入对象； WeatherData也需要做多处修改。不利于维护，不是动态加入。
 * ----违背了ocp原则  ===》引入观察者模式
 *
 */
public class WeatherData {
    // 温度
    private float temperature;

    // 湿度
    private float humidity;

    //气压
    private float pressure;

    private CurrentCondtions currentCondtions;

    /**
     * 设定currentCondtions的值
     *
     * @param currentCondtions 设定值
     */
    public void setCurrentCondtions(CurrentCondtions currentCondtions) {
        this.currentCondtions = currentCondtions;
    }

    public WeatherData() {

    }

    // 当气象站观测到数据有变化时就调用setData方法更新数据
    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 将最新的数据推送给各个平台
        dataChange();
    }

    public void dataChange() {
        // 调用借入方update方法
        currentCondtions.update(getTemperature(), getHumidity(), getPressure());
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
