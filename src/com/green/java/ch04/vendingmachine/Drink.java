package com.green.java.ch04.vendingmachine;

public class Drink {
    private int price;
    private String nm;
    private String company;
    private int ml;

    public Drink(int price, String nm, String company, int ml){
        this.price = price;
        this.nm = nm;
        this.company = company;
        this.ml = ml;

    }
    public int getprice(){
        return price;
    }
    public String getnm(){
        return nm;
    }
    public String getcompany(){
        return company;

    }
    public int getml(){
        return ml;
    }
}
