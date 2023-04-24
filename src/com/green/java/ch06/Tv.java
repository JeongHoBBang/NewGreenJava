package com.green.java.ch06;
//usages는 몇번 사용했나 나옴.
public class Tv {
    //인스턴스 멤버필드
    String color;
    boolean power;
    int channel;

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
