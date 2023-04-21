package com.green.java.ch06;

public class Bike {
    String brand;//클래스 변수 클래스 멤버필드
    String model;//
    int price;

    public Bike(){
    }
    public Bike(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public Bike(Bike bike){
        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;
    }
    void drive(){
        System.out.printf("%s브랜드 %s모델",brand,model);
    }

}