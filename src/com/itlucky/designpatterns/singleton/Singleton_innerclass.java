package com.itlucky.designpatterns.singleton;

/**
 * 单例模式_静态内部类
 *
 *当Innerclass被装载的时候，其静态内部类inner是不会被装载。
 * 只有当调用getInstance()方法的时候才会装载内部类，这是利用类加载的机制，
 * 可以达到懒加载的效果，并且是线程安全的。
 *
 */
public class Singleton_innerclass {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            new Thread(()->{
                Innerclass.getInstance();
            }).start();
        }
    }
}


class Innerclass{

    private Innerclass(){
        System.out.println("单例模式_静态内部类_初始化！~");
    }

    private static class inner{
        private final static Innerclass instance = new Innerclass();
    }

    public static Innerclass getInstance(){
        return inner.instance;
    }
}