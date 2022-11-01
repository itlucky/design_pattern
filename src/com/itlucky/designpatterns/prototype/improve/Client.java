package com.itlucky.designpatterns.prototype.improve;

public class Client {

    public static void main(String[] args) {

        System.out.println("==========利用【原型设计模式】实现对象的创建~~");

        Sheep sheep = new Sheep("BBB",10,"黑色");
        sheep.friend = new Sheep("AAA",16,"棕色");

        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();
        // ....

        System.out.println("sheep1  " + sheep1 + " sheep1.friend " + sheep1.friend);
        System.out.println("sheep2  " + sheep2 + " sheep2.friend " + sheep2.friend);
        System.out.println("sheep3  " + sheep3 + " sheep3.friend " + sheep3.friend);
        System.out.println("sheep4  " + sheep4 + " sheep4.friend " + sheep4.friend);
        System.out.println("sheep5  " + sheep5 + " sheep5.friend " + sheep5.friend);
        // .....

        // hashcode的值是一样的。因为是浅拷贝，所以引用类型的成员变量是复制内存地址，指向的还是同一个对象。
        System.out.println(sheep1.friend.hashCode());
        System.out.println(sheep2.friend.hashCode());
        System.out.println(sheep3.friend.hashCode());
        System.out.println(sheep4.friend.hashCode());
        System.out.println(sheep5.friend.hashCode());

    }

}
