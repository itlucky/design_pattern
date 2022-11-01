package com.itlucky.designpatterns.singleton;

public class Singleton_Lazy2 {

    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            new Thread(()->{
                Lazy2.getInstance();
            }).start();
        }
    }
}

// synchronized 同步处理，解决线程不安全的问题
class Lazy2{

    private Lazy2(){
        System.out.println("单例模式_饿汉式2_初始化~");
    }

    private static Lazy2 instance;

    // 每个线程想获取实例的时候都需要同步阻塞，而实际上这个方法只需要执行一次实例化就够了。
    // 所以这种写法 大大降低了效率，不推荐使用。【可以解决线程安全问题】
    /*public static synchronized Lazy2 getInstance(){
        if(instance == null){
            instance = new Lazy2();
        }
        return instance;
    }*/

    // 【不能解决线程安全问题】
    // 同样存在问题多个线程读到 if(instance == null)这个条件
    // 因此不能使用这种方式
    public static Lazy2 getInstance(){

        if(instance == null){
            synchronized (Lazy2.class){
                instance = new Lazy2();
            }
        }
        return instance;
    }

}