package com.itlucky.principle.openclose;

/**
 * 使用开闭原则对案例进行改进
 */
public class Ocp2 {

    public static void main(String[] args) {
        GraphicEditor2 ge2 = new GraphicEditor2();
        ge2.drawShape(new Rectangle2());
        ge2.drawShape(new Circle2());

        ge2.drawShape(new Triangle2());

        ge2.drawShape(new OtherShape());
    }
}


class GraphicEditor2{
    public void drawShape(Shape2 sp2){
        sp2.draw();
    }
}


abstract class Shape2{

    abstract void draw();
}

class Rectangle2 extends Shape2{

    @Override
    void draw() {
        System.out.println("画矩形");
    }
}
class Circle2 extends Shape2{

    @Override
    void draw() {
        System.out.println("画圆形");
    }
}

class Triangle2 extends Shape2{

    @Override
    void draw() {
        System.out.println("画三角形");
    }
}

class OtherShape extends Shape2{

    @Override
    void draw() {
        System.out.println("绘制其他图形");
    }
}