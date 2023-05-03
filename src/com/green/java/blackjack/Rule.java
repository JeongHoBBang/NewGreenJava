package com.green.java.blackjack;

import java.util.List;

public class Rule {
    public int getScore(List<Card>cardList) {
        int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;
    }
    private int getDenominationToNum(Card c){
        switch(c.getDenomination()){
            case "A":return 1;
            case "J": case"Q": case"K": return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }
}
//        int sum=0;
//        for (int i = 0; i < cardList.size(); i++) {
//            switch(cardList.get(i).getDenomination()){
//                case "A":
//                    Score=1;
//                case "Q":
//                    Score=10;
//                case "K":
//                    Score=10;
//                case "J":
//                    Score=10;
//            }
//            sum +=Score;
//        }
//        return sum;

