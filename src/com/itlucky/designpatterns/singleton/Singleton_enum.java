package com.itlucky.designpatterns.singleton;

public class Singleton_enum {

    public static void main(String[] args) {
        _Singleton instance = _Singleton.INSTANCE;
        _Singleton instance2 = _Singleton.INSTANCE;

        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.say();
    }
}

/**
 * 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 【推荐使用】
 */
enum _Singleton{

    INSTANCE;

    public void say(){
        System.out.println("=====单例模式_枚举类~=====");
    }

}