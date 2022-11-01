package com.itlucky.designpatterns.factory.factorymethod.order;

import com.itlucky.designpatterns.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class OrderPizza {

    // 让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;

        String orderType = "";
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法，由各个工厂子类实现

            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("披萨制作失败~");
                break;
            }


        }while (true);
    }

    private String getType(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza Type:");
            String str = reader.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }

}
