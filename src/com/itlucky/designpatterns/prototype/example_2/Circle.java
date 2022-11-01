package com.itlucky.designpatterns.prototype.example_2;

public class Circle extends Shape{

    public Circle(){
        type = "circle";
    }


    @Override
    void draw() {
        System.out.println("画圆形方法~");
    }
}
