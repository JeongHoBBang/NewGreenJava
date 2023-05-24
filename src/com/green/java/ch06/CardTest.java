package com.green.java.ch06;


public class CardTest {
    public static void main(String[] args){
        CardDeck cd = new CardDeck();
        User u1 = new User();


        Card c1 = cd.pick();
        u1.receiveCard(c1);
        u1.receiveCard(cd.pick());
        u1.showTotalNum();

    }

}
