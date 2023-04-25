package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("-----");
        cd.shuffle();
        cd.openCards();//이렇게 적으면 보이드
        System.out.println("------");

        for (int i = 0; i < cd.cards.length; i++) {
            cd.pick();

        }
        cd.pick();




        cd.openCards();


    }
}
