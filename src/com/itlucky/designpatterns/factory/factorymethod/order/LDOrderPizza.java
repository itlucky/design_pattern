package com.itlucky.designpatterns.factory.factorymethod.order;

import com.itlucky.designpatterns.factory.factorymethod.pizza.*;


/**
 * 伦敦口味披萨的制作工厂
 */
public class LDOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;

    }
}
