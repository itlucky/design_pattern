package com.itlucky.designpatterns.factory.simplefactory.pizza;

public class ChinaPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 准备制作中国披萨 ~");
    }
}
