package com.itlucky.designpatterns.prototype.example_2;

public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("画长方形的方法");
    }
}
