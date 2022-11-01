package com.itlucky.designpatterns.factory.abstractfactory.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("==北京胡椒披萨准备制作原材料~--");
    }
}
