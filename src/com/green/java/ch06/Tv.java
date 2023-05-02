package com.green.java.ch06;
//usages는 몇번 사용했나 나옴.
public class Tv {
    //인스턴스 멤버필드 객체화를 해야 클래스 멤버필드에서 사용가능
    String color; //초기값 null 대문자로 시작하면 0
    boolean power; //초기값 false
    int channel; //초기값 0

    static String brand; //클래스 멤버필드

    void power(){power=!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
    void test(String str){
        System.out.println(str);
    }
    static String getBrand(){
        return brand;
    }
}