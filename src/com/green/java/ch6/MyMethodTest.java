package com.green.java.ch6;

public class MyMethodTest {
    public static void main(String[] args){
        MyMethod mm = new MyMethod();
        mm.sum(10,20);//<call method 호출메소드
        mm.sum(10,22);
        mm.sum(10,223);
        mm.sum(10,245);

        int result = mm.sum2(10, 245);
        System.out.println("result:"+result);
    }
}
