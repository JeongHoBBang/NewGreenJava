package com.green.java.ch07.cards;

public class CardDeck {


    Card[] cards;

    CardDeck(){
        cards = new Card[52];//카드의 갯수가 52개다
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card("","");
            }
        }
    }
