package com.itlucky.designpatterns.observer.jdkexample;

import java.util.Observable;
import java.util.Observer;

/**
 * 这里的 Observable就相当于Subject，只不过jdk里是一个类，我们使用Subject用的是接口。
 * 通过源码可以的看到里面的实现逻辑：
 * 1.有一个存放观察者Observer的集合；
 * 2.addObserver 添加观察者的方法
 * 3.deleteObserver 移除观察者的方法
 * 4.notifyObservers 通知所有观察者的方法
 * 5. Observer 等价于前面所说的Observer，都有update()方法。
 */
public class Jdk_Observer {

    public static void main(String[] args) {
        Observable observable;
        Observer observer;

    }

}
