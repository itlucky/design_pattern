package com.itlucky.designpatterns.prototype.example_2;

import java.util.Hashtable;


public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId)
        throws CloneNotSupportedException {

        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape)cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    public static void loadCache(){

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);

    }


}
