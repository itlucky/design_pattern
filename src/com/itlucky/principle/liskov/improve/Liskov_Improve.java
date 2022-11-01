package com.itlucky.principle.liskov.improve;


/**
 * 案例改进：定义一个更基础的基类，将原有的继承关系去掉，采用聚合 /组合 /依赖等关系来替换。
 * 如何正确的使用继承？ ===>  里氏替换原则
 */
public class Liskov_Improve {

    public static void main(String[] args) {
        C c = new C();
        System.out.println("11-8=" + c.fun1(11,8));
        System.out.println("1-8=" + c.fun1(1,8));
        System.out.println("===================");

        D d = new D();
        System.out.println("15+3=" + d.fun1(15,3)); //再使用就能很明确的知道是要用加法
        System.out.println("1+9=" + d.fun1(1,9));
        System.out.println("3*8=" + d.fun2(3,8));

    }
}

//定义一个更基础的基类
class Base{
    //TODO  实现公共的基础方法
}

class C extends Base{
    public int fun1(int x,int y){
        return x-y;
    }
}

class D extends Base {
    //通过组合实现C中的方法调用
    C c = new C();

    public int fun1(int x,int y){
        return x+y;
    }

    public int fun2(int x,int y){
        return x*y;
    }

    public int fun3(int x,int y){
        return c.fun1(x,y);
    }
}


