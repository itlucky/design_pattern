package com.itlucky.designpatterns.factory.simplefactory.pizza;

/**
 * 希腊披萨
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨 准备原材料~");
    }
}
