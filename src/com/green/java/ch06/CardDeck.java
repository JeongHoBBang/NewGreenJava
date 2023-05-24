package com.green.java.ch06;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] KINDS = {"spade", "heart", "clover", "diamond"};
    public static final int MAX_NUMS = 13;
    List<Card> cardList;//<>안에 있는게 카드안에 있는 값만 받을수있음


    public CardDeck() {//기본 생성자
        cardList = new ArrayList<>();
        //spade, heart, clover,diamond
        //번호 A,2~10,J,Q,K
        for (String kind : KINDS) {
            for (int i = 1; i <= MAX_NUMS; i++) {
                String num = getKind(i);
                cardList.add(new Card(kind, num));

            }


        }

    }


    private String getKind(int n) {
        switch (n) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(n);


    }
    public void printAllCard(){
        for(Card cd:cardList)
            System.out.println(cd);
    }
    public Card pick(){
        int pick = (int)(Math.random()*cardList.size());
        return cardList.remove(pick);
    }

}