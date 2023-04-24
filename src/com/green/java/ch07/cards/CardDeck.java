package com.green.java.ch07.cards;

public class CardDeck {


    Card[] cards;
    int idx;

    CardDeck() {

        cards = new Card[52];//카드의 갯수가 52개다
//        for (int i = 0; i < cards.length; i++) {
//            cards[i] = new Card("","");
//            }
        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                String num = null;
                switch (z) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
//                        num = z + "";
                        num = String.valueOf(z);//위에꺼랑 같은거
                }
                cards[idx++] = new Card(Card.KINDS[i], num);
            }


        }


    }


    void openCards() {
        for (Card c : cards) {
            System.out.println(c);
        }

    }


    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;


        }

    }

    Card pick() {
        if(idx == cards.length){return null;}
        Card c = cards[idx];
        cards[idx] = null;
        idx++;
        return c;

    }
}














