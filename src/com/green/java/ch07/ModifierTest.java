package com.green.java.ch07;

public class ModifierTest {
    private int num1; //내부에서만 사용
    int num2;         //default 자동으로 생김 패키지 안까지 가능
    protected int num3;//상속관계에서만 사용가능
    public int num4;//완전 공유 무조건 접근가능.

    public void printNum1() {
        System.out.println(num1);
    }
}
