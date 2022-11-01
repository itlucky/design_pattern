package com.itlucky.designpatterns.singleton;

/**
 * 单例_饿汉式_静态代码块
 *
 *   静态代码块同样是在类装载的时候完成的实例化。
 *
 *   这种单例模式可用，但是【可能】造成内存浪费。
 */
public class Singleton_hungry2 {

    public static void main(String[] args) {
        Hungry2 instance = Hungry2.getInstance();
        Hungry2 instance2 = Hungry2.getInstance();

        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}


class Hungry2{

    private Hungry2(){

    }

    private static Hungry2 instance;

    static {
        instance = new Hungry2();
    }

//    静态共有方法返回实例对象
    public static Hungry2 getInstance(){
        return instance;
    }

}
