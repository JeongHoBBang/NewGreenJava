package com.green.java.ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model="소나타";
        c1.price = 2000;
        Car.powerOn();
        Car.brand = "기아";
        //Integer.parseInt("11");//객체선언하지 않고도 실행할수 있는건 스태틱밖에 없다.
        c1.printInfo();
    }
}
