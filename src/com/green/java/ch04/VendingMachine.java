package com.green.java.ch04;

public class VendingMachine {
    private int money = 0;
//    int sum = 0;
    public void insert(int money){
        this.money+=money;




    }
    public void showMoney(){
//        sum+=money;
        System.out.printf("현재 잔액은%,d원입니다\n",money);
    }
}
