package com.green.java.blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();


        Card c1 =cd.getCard();
        System.out.println(c1);

        System.out.println("---------");

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());

        }

        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        if(dealer.isReceiveCard()) {
            dealer.receiveCard(cd.getCard());
        }

        int gamerScore = rule.getScore(gamer.openCards());
        int dealerScore = rule.getScore(dealer.openCards());
        System.out.println(gamerScore);
        System.out.println(dealerScore);
        gamer.showCards();


        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Card More? (y/n)");
            String answer = scan.nextLine();
            if("n".equals(answer.trim().toLowerCase())){
                break;
            }
            gamer.receiveCard(cd.getCard());
            gamer.showCards();
        }
        System.out.println("--딜러카드--");
        dealer.showCards();
        Rule.whoIsWin(gamer,dealer);
    }
}
