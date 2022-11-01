package com.itlucky.designpatterns.factory.abstractfactory.order;

import com.itlucky.designpatterns.factory.abstractfactory.pizza.BJCheesePizza;
import com.itlucky.designpatterns.factory.abstractfactory.pizza.BJPepperPizza;
import com.itlucky.designpatterns.factory.abstractfactory.pizza.Pizza;

// 北京生产的工厂子类
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("=====使用抽象工厂模式=====");

        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
