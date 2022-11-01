package com.itlucky.designpatterns.singleton;

public class Test {

    public static void main(String[] args) {
//        for (int i = 0; i<20; i++) {
//            new Thread(()->{
//                DoubleCK.getInstance();
//            }).start();
//        }
    }
}

//**测试提交

// 9999999

// branch1分支做了修改  测试修改同一个地方发生冲突by branch-1
//
//class DoubleCK {
//
//    private DoubleCK(){
//        System.out.println("单例模式_双重检查_实例化~");
//    }
//
//    private static volatile DoubleCK instance;
//
//    public static DoubleCK getInstance(){
//        if(instance == null){
//            synchronized (DoubleCK.class){
//                if(instance == null){
//                    instance = new DoubleCK();
//                }
//            }
//        }
//        return instance;
//    }
//}
//
//class Hungr{
//
//    private Hungr(){
//
//    }
//
//    private static final Hungr instance = new Hungr();
//
//    public static Hungr getInstance(){
//        return instance;
//    }
//}
//
//
////静态内部类  实现懒加载   单例模式
//class Hungr2{
//
//    private Hungr2(){
//
//    }
//
//    private static Hungr2 instance;
//
//    static {
//        instance = new Hungr2();
//    }
//
//    public static Hungr2 getInstance(){
//        return instance;
//    }

//}
