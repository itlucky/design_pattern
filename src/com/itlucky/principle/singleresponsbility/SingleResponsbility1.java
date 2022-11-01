package com.itlucky.principle.singleresponsbility;

/**
 * 运行发现飞机也在公路上运行了
 */
public class SingleResponsbility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

// 分析：这个交通工具类方法限制了只能运行到公路上
class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行！");
    }
}