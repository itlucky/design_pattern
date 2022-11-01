package com.itlucky.designpatterns.singleton;

/**
 * 单例_饿汉式_静态常量
 * 这种方式基于classloader机制避免了多线程同步的问题，这里instance在类加载的时候就实例化。
 *
 * 这种单例模式可用，不过【可能】造成内存浪费。
 *
 */
public class Singleton_hungry {

    public static void main(String[] args) {
//        Hungry1 hg1 = Hungry1.getInstance();
//
//        Hungry1 hg2 = Hungry1.getInstance();
//
//        System.out.println(hg1 == hg2);
//
//        System.out.println(hg1.hashCode());
//        System.out.println(hg2.hashCode());

        for (int i = 0; i<10; i++) {
            new Thread(()->{
                Hungry1.getInstance();

            }).start();
        }

    }
}


class Hungry1{

    private Hungry1(){
        System.out.println("单例模式-静态常量~初始化~");
    }
    private static Hungry1 instance = new Hungry1();

    public static Hungry1 getInstance(){
        return instance;
    }

}
