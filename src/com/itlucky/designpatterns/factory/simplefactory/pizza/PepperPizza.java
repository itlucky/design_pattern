package com.itlucky.designpatterns.factory.simplefactory.pizza;

// 胡椒披萨
// 假如pizza种类变多，要增加扩展性

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨 准备原材料~");
    }
}
