package com.itlucky.designpatterns.factory.simplefactory.order;

import com.itlucky.designpatterns.factory.simplefactory.pizza.CheesePizza;
import com.itlucky.designpatterns.factory.simplefactory.pizza.GreekPizza;
import com.itlucky.designpatterns.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 订购披萨
 *
 * 如果订购披萨的业务也有好多，还有更多的OrderPizza1、OrderPizza2...
 * 那么在这里生成披萨的方法随着披萨种类的增加，也要跟着变化.
 * 因此可以使用简单工厂模式来解决这类问题。将生产披萨的方法抽到简单工厂类中。
 */
public class OrderPizza {

//    public OrderPizza(){

//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//            }else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//            }else {
//                break;
//            }
//            // 输出pizza制作过程
//            pizza.setName(orderType);
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }


    public OrderPizza(){
       setSimpleFactory();
    }


    Pizza pizza = null;

    public void setSimpleFactory() {


        String orderType="";//用户输入
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);
            // 输出pizza制作过程
            if(pizza != null){ // 订购成功
                pizza.setName(orderType);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("披萨订购失败~~ ");
                break;
            }
        }while (true);
    }
//    public void setSimpleFactory(SimpleFactory simpleFactory) {
//
//        this.simpleFactory = simpleFactory;
//
//
//        String orderType="";//用户输入
//        do{
//            orderType = getType();
//            pizza = simpleFactory.createPizza(orderType);
//            // 输出pizza制作过程
//            if(pizza != null){ // 订购成功
//                pizza.setName(orderType);
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            }else {
//                System.out.println("披萨订购失败~~ ");
//                break;
//            }
//        }while (true);
//    }

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
