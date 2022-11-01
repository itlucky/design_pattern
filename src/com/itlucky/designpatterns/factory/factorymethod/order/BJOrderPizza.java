package com.itlucky.designpatterns.factory.factorymethod.order;

import com.itlucky.designpatterns.factory.factorymethod.pizza.BJCheesePizza;
import com.itlucky.designpatterns.factory.factorymethod.pizza.BJPepperPizza;
import com.itlucky.designpatterns.factory.factorymethod.pizza.Pizza;


/**
 *  北京口味披萨的制作工厂
 */
public class BJOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
