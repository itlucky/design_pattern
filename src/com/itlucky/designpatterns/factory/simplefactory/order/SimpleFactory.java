package com.itlucky.designpatterns.factory.simplefactory.order;

import com.itlucky.designpatterns.factory.simplefactory.pizza.*;


/**
 * 简单工厂类
 *
 * 该类专门用来生产披萨，那么就算再有新的口味的披萨，也只需要在这里修改就行，不需要更改不同的订购披萨类
 */
public class SimpleFactory {

    // 加上static修饰就是静态工厂类
    public static Pizza createPizza(String orderType){

        System.out.println("---->使用简单工厂模式创建披萨~");

        Pizza pizza = null;

        if(orderType.equals("greek")){
            pizza = new GreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
        }else if(orderType.equals("china")){
            pizza = new ChinaPizza();
        }else {
            return null;
        }
        return pizza;
    }
}
