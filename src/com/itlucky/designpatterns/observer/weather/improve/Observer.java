package com.itlucky.designpatterns.observer.weather.improve;

/**
 * 观察者
 */
public interface Observer {

    // 观察到数据变化要做的动作
    void update(float temperature, float humidity, float pressure);
}
