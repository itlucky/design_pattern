package com.itlucky.principle.singleresponsbility;

public class SingleResponsbility2 {

    public static void main(String[] args) {
        RoladVehicle roladVehicle = new RoladVehicle();
        roladVehicle.run("摩托车");
        roladVehicle.run("小汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游艇");
    }
}

// 遵守单一职责原则
// 但是这样的改动很大，即将类进行分解，同时修改客户端
class RoladVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行!");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞行!");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水上运行!");
    }
}
