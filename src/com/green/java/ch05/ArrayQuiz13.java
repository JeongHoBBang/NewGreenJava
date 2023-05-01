package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] LottoArr = new int[6];
        setRandomValuArr(LottoArr);
        sortArr(LottoArr);
        System.out.println(Arrays.toString(LottoArr));
    }



    public static void sortArr(int[] LottoArr) {
        for (int i = LottoArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (LottoArr[j] > LottoArr[j+1] ) {
                    int temp = LottoArr[j];
                    LottoArr[j] = LottoArr[j + 1];
                    LottoArr[j + 1] = temp;
                }
            }
        }
    }
    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1)) + 1;
    }



    static void setRandomValuArr(int[] LottoArr) {
        for (int i = 0; i < LottoArr.length; i++) {
            int rval = getRandomValueFromTo(1, 6);
            for (int j = 0; j < LottoArr.length; j++) {
                if (LottoArr[j] == 0) {
                    LottoArr[j] = rval;
                    break;
                } else if (LottoArr[j] == rval) {
                    i--;
                    break;
                }
            }
        }
    }
}
