package com.green.java.ch07.cards;

public class Card {
    static final String[] KINDS = {"CLOVER", "HEART", "DIAMOND","SPADE"};//문희들~
    static final int NUM_MAX = 13; //무늬별 카드 수

    String kind;//무늬
    String num;//번ho

    //외부에서 무늬,번호 값을 받아서 나의 멤버필드 무늬와 번호에 대입하는 생성자 만들어 주세요.
    public Card(String kind, String num) {
        this.kind = kind;
        this.num = num;


    }


}




