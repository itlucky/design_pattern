package com.itlucky.designpatterns.observer.weather.improve;

/**
 * 观察者模式好处：
 * 1.观察者模式设计后，会以集合的方式来管理用户（Observer），包括注册、移除和通知。
 * 2.这样，我们增加观察者，就不需要去修改核心类WeatherData的代码，遵守了ocp原则。
 */
public class Client {
    public static void main(String[] args) {

        WeatherData wd = new WeatherData();

        CurrentCondition cc = new CurrentCondition();
        Baidu bd = new Baidu();
        wd.registerObserver(cc);
        wd.registerObserver(bd);

        WangYi wy = new WangYi();
        wd.registerObserver(wy);

        // 移除一个观察者
//        wd.remove(cc);

        wd.setData(88,22,55);

        System.out.println("**************天气变更后**************");

        wd.setData(99,23,66);

    }
}
