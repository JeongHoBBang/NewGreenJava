package com.green.java.ch04;

public class VendingMachine {
    private int money;
    private String[] menuNames = {"콜라", "사이다", "환타", "미란다"};
    private int[] menuPriceArr = {1000, 1500, 2000, 2500};

    //    int sum = 0;
    public void insert(int money) {
        this.money += money;


    }

    public void showMoney() {
//        sum+=money;
        System.out.printf("현재 잔액은%,d원입니다\n", money);
    }

    public void showMenus() {
        System.out.println("번호 \t 메뉴명\t 가격\n");
        for (int i = 0; i < menuNames.length; i++) {
            System.out.printf("%d. \t %s\t %,d원\n", i + 1, menuNames[i], menuPriceArr[i]);
        }
    }public void purchaseDrink(int num){
        int idx = num-1;
        System.out.printf("%s를 구매하였습니다.\n",menuNames[idx]);
        this.money -= menuPriceArr[idx];
    }
}