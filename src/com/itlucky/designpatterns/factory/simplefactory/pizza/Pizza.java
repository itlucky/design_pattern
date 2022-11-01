package com.itlucky.designpatterns.factory.simplefactory.pizza;

/**
 * Pizza 抽象类
 */
public abstract class Pizza {

    // pizza名称
    protected String name;

    // 准备原材料
    public abstract void prepare();
    // 烘烤
    public void bake(){
        System.out.println(name + "  baking;");
    }
    // 切片
    public void cut(){
        System.out.println(name + "  cutting;");
    }
    // 打包
    public void box(){
        System.out.println(name + "  boxing;");
    }

    /**
     * 设定name的值
     *
     * @param name 设定值
     */
    public void setName(String name) {
        this.name = name;
    }
}
