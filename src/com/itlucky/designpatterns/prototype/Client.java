package com.itlucky.designpatterns.prototype;

// 传统方式解决克隆羊问题：
//
// 1.在创建对象的时候，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低。
// 2.总是需要重新初始化对象，而不是动态的获取对象运行时的状态，不够灵活。

// 改进思路：java中Object类是所有类的根类，Object类提供了一个clone()方法。该方法可以将一个java对象复制一份。
// 但是需要实现clone的java类必须要实现一个cloneable接口，该接口表示该类能够复制且具备复制的能力 ===>原型模式。

public class Client {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("Tom", 11, "白色");

        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        // .....

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        // ......

    }
}
