package com.itlucky.designpatterns.prototype;

import com.itlucky.designpatterns.prototype.improve.Sheep;

// 主要关注对象里面的克隆方法【拷贝】
public class Test {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("2333",12,"bai");

        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println(sheep1 == sheep2);


    }

}
