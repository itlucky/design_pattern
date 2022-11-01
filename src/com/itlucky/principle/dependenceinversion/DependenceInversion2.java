package com.itlucky.principle.dependenceinversion;

/**
 * 依赖倒转实现的案例
 */
public class DependenceInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.recive(new Email());
        person.recive(new WeiXin());
    }
}

interface IReciver{
    public String getInfo();
}

class Email implements IReciver{
    @Override
    public String getInfo() {
        return "电子邮件消息：hello email-msg";
    }
}

class WeiXin implements IReciver{

    @Override
    public String getInfo() {
        return "微信消息：你好，朋友~";
    }
}

class Person{
    // 依赖的是接口
    public void recive(IReciver reciver){
        System.out.println(reciver.getInfo());
    }
}