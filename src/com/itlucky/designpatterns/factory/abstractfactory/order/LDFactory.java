package com.itlucky.designpatterns.factory.abstractfactory.order;

import com.itlucky.designpatterns.factory.abstractfactory.pizza.*;
import com.itlucky.designpatterns.factory.abstractfactory.pizza.LDPepperPizza;


// 伦敦生产的工厂子类
public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("=====使用抽象工厂模式=====");

        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
