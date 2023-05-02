package com.green.java.ch04.vendingmachine;

import com.green.java.ch04.vendingmachine.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();//벤딩머신 타입은 벤딩머신 객체 주소값 담을수 있음
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.showMenus();
        vm.purchaseDrink(1);//콜라를 구매하였습니다. (money값은 - 1000처리)
        vm.purchaseDrink(2);

        vm.showPurchaseList();
        /*
        번호 \t 메뉴명 \t 가격
        1. \t 콜라 \t 1,000원
        2. \t 사이다 \t 1,500원
        3. \t 환타 \t 2,000원
        4. \t 미란다 \t 2,500원
         */
        vm.showMoney(); //잔액

    }
}
