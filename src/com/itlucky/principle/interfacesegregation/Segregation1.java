package com.itlucky.principle.interfacesegregation;

/**
 * 接口隔离原则:
 * 这里演示未隔离情况，
 */
public class Segregation1 {

}

interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}


class C implements Interface1 {

    @Override public void operation1() {
        System.out.println("C实现了operation1");
    }

    @Override public void operation2() {
        System.out.println("C实现了operation2");
    }

    @Override public void operation3() {
        System.out.println("C实现了operation3");
    }

    @Override public void operation4() {
        System.out.println("C实现了operation4");
    }

    @Override public void operation5() {
        System.out.println("C实现了operation5");
    }
}

class D implements Interface1{

        @Override
        public void operation1() {
            System.out.println("D实现了operation1");
        }

        @Override
        public void operation2() {
            System.out.println("D实现了operation1");
        }

        @Override
        public void operation3() {
            System.out.println("D实现了operation1");
        }

        @Override
        public void operation4() {
            System.out.println("D实现了operation1");
        }

        @Override
        public void operation5() {
            System.out.println("D实现了operation1");
        }
}

class A { //A类通过Interface1 依赖C类，只会用到1,2,3方法
    void depend1(Interface1 c){
        c.operation1();
    }
    void depend2(Interface1 c){
        c.operation2();
    }
    void depend3(Interface1 c){
        c.operation3();
    }
}

class B { //B类通过Interface1 依赖D类，只会用到1,4,5方法
    void depend1(Interface1 d){
        d.operation1();
    }
    void depend4(Interface1 d){
        d.operation4();
    }
    void depend5(Interface1 d){
        d.operation5();
    }
}

