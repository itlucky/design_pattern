package com.itlucky.designpatterns.observer.weather.improve;

/**
 *
 */
public interface Subject {

    // 注册观察者
    void registerObserver(Observer observer);
    // 移除观察者
    void remove(Observer observer);
    // 通知
    void notifyObservers();

}
