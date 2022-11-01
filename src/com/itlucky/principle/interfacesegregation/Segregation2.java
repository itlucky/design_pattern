package com.itlucky.principle.interfacesegregation;

/**
 * 接口隔离原则，将接口拆分。
 * 这样类A,类B只需要跟要用到的接口实现类建立依赖关系即可。
 */
public class Segregation2 {

    public static void main(String[] args) {
        A1 a = new A1();
        a.depend1(new D1());
        a.depend2(new C1());
        a.depend3(new C1());

        B1 b = new B1();
        b.depend1(new C1());
        b.depend4(new D1());
        b.depend5(new D1());

    }

}

interface Interface2{
    void operation1();
}
interface Interface3{
    void operation2();
    void operation3();
}
interface Interface4{
    void operation4();
    void operation5();
}

class C1 implements Interface2,Interface3{

    @Override
    public void operation1() {
        System.out.println("C1实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("C1实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("C1实现了operation3");
    }
}

class D1 implements Interface2,Interface4{

    @Override
    public void operation1() {
        System.out.println("D1实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D1实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D1实现了operation5");
    }
}

class A1{
    public void depend1(Interface2 i) {
        i.operation1();
    }

    public void depend2(Interface3 i){
        i.operation2();
    }
    public void depend3(Interface3 i){
        i.operation3();
    }
}

class B1{
    public void depend1(Interface2 i){
        i.operation1();
    }

    public void depend4(Interface4 i){
        i.operation4();
    }

    public void depend5(Interface4 i){
        i.operation5();
    }

}