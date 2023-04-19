package com.green.java.ch6;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();//입력된hour,minute,scond때문에 정수값 3개 저장가능
        //hour 1~23
        System.out.println("hour:"+t1.getHour());
        t1.setHour(1);
        System.out.println("hour:"+t1.getHour());


    }
}
