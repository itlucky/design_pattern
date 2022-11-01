package com.itlucky.designpatterns.factory.abstractfactory.order;

import com.itlucky.designpatterns.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza {

    // 组合
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    // 私有方法，不给外界修改的机会
    private void setAbsFactory(AbsFactory factory) {
        this.factory = factory;
        Pizza pizza = null;

        String orderType = ""; //用户输入

        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);

            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("披萨订购失败！~");
                break;
            }

        }while (true);


    }

    // 控制台输入用户需要制作的披萨种类。
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
