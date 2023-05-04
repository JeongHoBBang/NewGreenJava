package com.green.java.blackjack;

import java.util.List;

public class Rule {
    public static int getScore(List<Card>cardList) {
        int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;
    }
    private static int getDenominationToNum(Card c){
        switch(c.getDenomination()){
            case "A":return 1;
            case "J": case"Q": case"K": return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }
    public static void whoIsWin(Gamer gamer, Dealer dealer){
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();
        int BLACKJACK_SCORE = 22;

        if(gPoint <= BLACKJACK_SCORE && (gPoint>dPoint||dPoint>BLACKJACK_SCORE)){
            System.out.println("게이머 승리");
        }else if(dPoint <=BLACKJACK_SCORE&&(dPoint>gPoint || gPoint>BLACKJACK_SCORE)){
            System.out.println("딜러 승리");
        }else{
            System.out.println("무승부");
        }
    }
}
//        int sum=0;
//        for (int i = 0; i < cardList.size(); i++) {
//            switch(cardList.get(i).getDenomination()){
//                case "A":
//                    Score=1;
//                case "Q":
//
//                case "K":
//                    Score=10;
//                case "J":
//                    Score=10;

//            }
//            sum +=Score;
//        }
//        return sum;

