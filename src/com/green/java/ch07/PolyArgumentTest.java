package com.green.java.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Product p = new Product(1);
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv); //100만원에 구매하였습니다.
        buyer.buy(com);//200만원에 구매하였습니다.

        buyer.printState(); // 나의 남은 돈은 얼마입니다. 포인트는 %,d 점입니다.

    }
}
class Buyer{

    private int money;
    private int bonusPoint;
    public void buy(Product p){
        bonusPoint += p.getBonusPoint();
        money = money - p.getPrice();
//        System.out.println(p.toString()+"을(를)"+p.getPrice()+"만원에 구매하였습니다.");
        System.out.printf("%s을(를)%,d만원에 구매하였습니다.\n",p,p.getPrice());
    }


    Buyer(){
        this.money = 1000;
        this.bonusPoint=0;
    }
    public void printState(){
        System.out.printf("나의 남은 돈은 %,d만원 입니다 보너스점수는 %,d점입니다.",money,bonusPoint);
    }

}

class Product{
    protected int price;
    protected int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price*0.1);
    }

    public int getPrice(){return price;}
    public int getBonusPoint(){return bonusPoint;}
}

class Tv2 extends Product{
    public Tv2(){
        super(100);
    }
    public String toString(){
        return "Tv";

    }
}

class Computer extends Product{
    public Computer(){
        super(200);
    }//생성자랑 메소드랑 다른점은 리턴타입이 없음 ,클래스명이랑 같아야함
    public String toString(){
        return "Computer";
    }//오버라이딩
}