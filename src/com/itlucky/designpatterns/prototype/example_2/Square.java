package com.itlucky.designpatterns.prototype.example_2;

public class Square extends Shape{

    public Square() {
        type = "square";
    }

    @Override
    void draw() {
        System.out.println("画正方形的方法~");
    }
}
