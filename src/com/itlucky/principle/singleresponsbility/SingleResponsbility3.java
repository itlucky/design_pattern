package com.itlucky.principle.singleresponsbility;

public class SingleResponsbility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();

        vehicle2.runAir("飞机");
        vehicle2.runRolad("自行车");
        vehicle2.runWater("轮船");
    }
}

// 分析：这种修改比第二种修改 改动比较小。
// 虽然在类的层面没有遵守单一职责原则，但是在方法级别上仍然是遵守单一职责。
class Vehicle2{

    public void runRolad(String vehicle){
        System.out.println(vehicle + "在公路上运行！");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空上运行！");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中上运行！");
    }
}