package com.green.java.ch06;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Card> cardList;
    public User(){
        cardList = new ArrayList<>();
    }

    public void receiveCard(Card c){
        cardList.add(c);
    }
    public void showTotalNum(){
        int sum = 0;
        for(Card c:cardList){
            System.out.println(c);
            sum+=getNum(c.getNum());

        }
        System.out.printf("점수:%d\n",sum);
    }
    private int getNum(String num){
        switch(num){
            case "A":return 1;
            case "J":return 11;
            case "Q":return 12;
            case "K":return 13;
        }
        return Integer.parseInt(num);
    }
}
