package com.itlucky.designpatterns.prototype.improve;

/**
 * 利用Object的clone()方法实现原型对象的创建。
 *
 * 1: 实现Cloneable接口
 * 2：重写clone方法
 *
 */
public class Sheep implements Cloneable{

    private String name;

    private int age;

    private String color;

    private String address = "蒙古羊";

    public Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public Object clone() {

        Sheep sheep = null;

        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败~！");
            e.printStackTrace();
        }

        return sheep;
    }

    /**
     * 取得address的值
     *
     * @return address 的值
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定address的值
     *
     * @param address 设定值
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 取得name的值
     *
     * @return name 的值
     */
    public String getName() {
        return name;
    }

    /**
     * 设定name的值
     *
     * @param name 设定值
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得age的值
     *
     * @return age 的值
     */
    public int getAge() {
        return age;
    }

    /**
     * 设定age的值
     *
     * @param age 设定值
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 取得color的值
     *
     * @return color 的值
     */
    public String getColor() {
        return color;
    }

    /**
     * 设定color的值
     *
     * @param color 设定值
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sheep [name=");
        builder.append(name);
        builder.append(",age=");
        builder.append(age);
        builder.append(",color=");
        builder.append(color);
        builder.append(",address=");
        builder.append(address);
        builder.append(']');
        return builder.toString();
    }
}



