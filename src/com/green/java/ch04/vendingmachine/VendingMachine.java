package com.green.java.ch04.vendingmachine;

import java.util.LinkedList;

public class VendingMachine {
    private int money;
    private String[] menuNames = {"콜라", "사이다", "환타", "미란다"};
    private int[] menuPriceArr = {1000, 1500, 2000, 2500};
    private LinkedList<Integer> purchaseList = new LinkedList<>();

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
    }

    public void purchaseDrink(int num) {
        int idx = num - 1;
        System.out.printf("%s를 구매하였습니다.\n", menuNames[idx]);
        money -= menuPriceArr[idx];
        purchaseList.add(idx);
    }

    public void showPurchaseList() {
        if(purchaseList.size()==0){
            System.out.println("제품을 구매하지 않았습니다.");
            return;
            }
        int idx = purchaseList.get(0);
        System.out.print(menuNames[idx]);

        for (int i = 1; i < purchaseList.size(); i++) {
            idx = purchaseList.get(i);
            System.out.printf(", %s",menuNames[i]);
        } System.out.println("을(를) 구매하였습니다.");
    }
}
