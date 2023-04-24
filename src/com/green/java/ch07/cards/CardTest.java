package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("-----");
        cd.shuffle();
        cd.openCards();//이렇게 적으면 보이드
        System.out.println("------");

        Card c1 = cd.pick();// = 이있으면 리턴 타입
        System.out.println(c1.kind+","+c1.num);

        Card c2 = cd.pick();// = 이있으면 리턴 타입
        System.out.println(c2.kind+","+c2.num);




        cd.openCards();


    }
}
