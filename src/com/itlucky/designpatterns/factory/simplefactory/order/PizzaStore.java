package com.itlucky.designpatterns.factory.simplefactory.order;

/**
 * 相当于一个客户端，发出披萨订购
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();

        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
        new OrderPizza();


    }
}
