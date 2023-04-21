package com.green.java.ch06;

public class Car {
    static String brand;//클래스 변수 클래스 멤버필드
    String model;//
    int price;

    static void powerOn(){
        System.out.printf("%s 차의 모델명시동 걸림",brand);

    }
    void printInfo(){
        System.out.printf("model: %s, price: %d\n",model,price);
    }

}
