package com.green.java.ch05;

/*
    번호  국어  영어  수학  총점  평균
    ==============================
    1   100    90    80  270   90.0
    2    20    20    20   60   20.0
    ...
    ==============================
    총점
    국어: 190
    영어: 180
    수학: 170
    
    Coding by 황주은
 */
public class ArrayEx19er {
    public static void main(String[] args) {
        String[] titles = { "국어", "영어", "수학", "사회" };
        int[] titleSumArr = new int[titles.length];
        int[][] score = {
                  { 100, 90, 80, 10 }
                , {  20, 20, 20, 20 }
                , {  30, 30, 30, 30 }
                , {  40, 40, 40, 40 }
        };

        System.out.println("총점\t평균");
        System.out.println("==============================");


    }
}
