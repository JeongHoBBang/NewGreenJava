package com.green.java.ch06;

public class Card {

    private String kind; //무늬
    private String num; // 번호


    public Card(String kind, String num){
        this.kind = kind;
        this.num=num;
    }

    public String getKind(){
        return kind;
    }

    public String getNum() {
        return num;
    }
    @Override
    public String toString() {
        return String.format("Card{%s,%s}",kind,num);
    }
}
