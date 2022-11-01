package com.itlucky.principle.liskov;

/**
 * 案例：不规范使用继承，带来的问题
 */

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-8=" + a.fun1(11,8));
        System.out.println("1-8=" + a.fun1(1,8));
        System.out.println("===================");

        B b = new B();
        System.out.println("15-3=" + b.fun1(15,3));  //本意想调减法，实际结果是做了加法
        System.out.println("1-9=" + b.fun1(1,9));
        System.out.println("3*8=" + b.fun2(3,8));

    }
}


class A{
    public int fun1(int x,int y){
        return x-y;
    }
}

class B extends A{
    // 这里集成A，重写了fun1(),可能是继承了之后无意修改了fun1(),
    // 那么就会导致原本以为调用的还是父类的减法操作，实际上是子类做了加法的操作。
    public int fun1(int x,int y){
        return x+y;
    }

    public int fun2(int x,int y){
        return x*y;
    }
}