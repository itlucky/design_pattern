package com.itlucky.designpatterns.factory.abstractfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("==北京奶酪披萨准备制作原材料~--");
    }
}
