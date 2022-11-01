package com.itlucky.designpatterns.factory.abstractfactory.order;

import com.itlucky.designpatterns.factory.abstractfactory.pizza.Pizza;


/**
 * 一个抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {

    // 让下面的工厂子类做具体实现
    public Pizza createPizza(String orderType);
}
