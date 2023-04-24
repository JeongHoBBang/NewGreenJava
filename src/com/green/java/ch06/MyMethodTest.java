package com.green.java.ch06;

import java.io.PrintStream;

public class MyMethodTest {
    public static void main(String[] args){
        MyMethod mm = new MyMethod();//마이메소드 주소값만 저장 가능
        mm.sum(10,20);//<call method 호출메소드
        mm.sum(10,22);
        mm.sum(10,223);
        mm.sum(10,245);

        int result = mm.sum2(10, 245);//리턴 메소드 리턴타입 인트 타입은 두개다 정수
        System.out.println("result:"+result);//객체 안의 객체

        PrintStream ps = System.out;//ps안에 들어갈수 있는건 PrintStream 객체 주소값만 저장 가능
        ps.println("result2:"+result);
    }
}
