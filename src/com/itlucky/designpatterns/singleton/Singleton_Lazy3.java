package com.itlucky.designpatterns.singleton;

/**
 * 单例模式_懒汉式_双重检测
 */
public class Singleton_Lazy3 {

    public static void main(String[] args) {

        for (int i = 0; i<10; i++) {
            new Thread(()->{
                Lazy3.getInstance();
            }).start();
        }
    }
}

// 双重检查，解决线程安全的问题，同时解决懒加载的问题， 也保证了效率。
// 【推荐使用这种单例模式】
class Lazy3{

    private Lazy3(){
        System.out.println("单例模式_饿汉式_双重检查_初始化~");
    }

    // volatile: 禁止指令重排
    private static volatile Lazy3 instance;

    public static Lazy3 getInstance(){
        if(instance == null) {
            synchronized (Lazy3.class){
                if(instance == null){
                    instance = new Lazy3();
                }
            }
        }
        return instance;
    }
}
