package com.itlucky.principle.openclose;

/**
 * 这里就违反了开闭原则：对扩展开发（针对提供方），对修改关闭（针对使用方）
 *   假如要新增一个图形:三角形，那么服务使用方也要做修改
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());

        ge.drawShape(new Triangle());
    }
}


//这是一个用于绘图的类【使用方】
class GraphicEditor{
    //接受Shape对象，然后根据type来绘制不同的图形
    public void drawShape(Shape sp){
        if(sp.type == 1)
            drawRectangle(sp);
        else if(sp.type==2)
            drawCircle(sp);
        else if(sp.type ==3)
            drawTriangle(sp);
    }

    public void drawRectangle(Shape s){
        System.out.println(" 绘制矩形 ");
    }
    public void drawCircle(Shape s){
        System.out.println(" 绘制圆形  ");
    }
    public void drawTriangle(Shape s){
        System.out.println(" 绘制三角形  ");
    }
}


// 基类
class Shape{
    int type;
}
// 矩形
class Rectangle extends Shape{

    Rectangle(){
        super.type =1;
    }
}
//圆形
class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}

// 新增三角形
class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }
}

