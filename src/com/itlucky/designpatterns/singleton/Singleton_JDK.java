package com.itlucky.designpatterns.singleton;

/**
 * JDK中的单例模式  Runtime
 *
 * 查看源码可知道Runtime是单例模式，采用的是饿汉式。
 *
 */
public class Singleton_JDK {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); //饿汉单例
    }
}
