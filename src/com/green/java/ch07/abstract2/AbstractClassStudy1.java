package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {
    //class 앞에 abstract를 붙이는게 추상 클래스다. 추상클래스는 객체화를 할수없다
    //객체화가 안되게끔 하고 싶을때 추상클래스(abstract)를 쓴다
    //추상이 아닌것들은 메모리에 올라감 단 직접 올리진 못함.
    //추상메소드는 너꼭 구현해 라는 강제성이있음.
    int multi(int n1, int n2){
        return n1*n2;
    }


    abstract void sum(int n1,int n2);
}

class ChildClass extends AbstractClassStudy1{
    @Override
    void sum(int n1, int n2) {
        System.out.println("합계:"+(n1+n2));
    }
}
class Child2Class extends AbstractClassStudy1{

    @Override
    void sum(int n1, int n2) {
        System.out.println("sum:"+(n1+n2));

    }
}