package com.itlucky.designpatterns.factory.abstractfactory.order;

public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
