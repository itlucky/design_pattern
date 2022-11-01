package com.itlucky.designpatterns.singleton;

/**
 * 单例_懒汉式_
 *
 * 【线程不安全】
 *
 *  优点： 懒加载效果，但是只能在单线程下使用。
 *
 *  缺点： 多线程情况下，一个线程进入 if(instance == null)，还没来得及往下执行，
 *        其他线程也通过了这个判断，这时就会产生多个实例。所以多线程下不可使用这种模式。
 *
 */
public class Singleton_Lazy {

    public static void main(String[] args) {

//        Lazy1 l1 = Lazy1.getInstance();
//        Lazy1 l2 = Lazy1.getInstance();
//
//        System.out.println(l1==l2);
//
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());

        for (int i = 0; i<10; i++) {
            new Thread(()->{
                Lazy1.getInstance();
            }).start();
        }

    }

}

class Lazy1{

    // 构造函数私有化
    private Lazy1(){
        System.out.println("懒汉式1，线程不安全~");
    }

    private static Lazy1 instance;


    // 只有当使用的时候才去实例化（懒加载）
    public static Lazy1 getInstance(){

        if(instance == null){
            instance = new Lazy1();
        }
        return instance;
    }

}
