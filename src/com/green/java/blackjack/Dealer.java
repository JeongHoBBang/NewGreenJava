package com.green.java.blackjack;

import java.util.List;

public class Dealer extends User {
    private final int CAN_RECEIVE_POINT = 16;

    public boolean isReceiveCard(){
        return getPointSum() <= CAN_RECEIVE_POINT;
        }
    }