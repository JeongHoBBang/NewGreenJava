package com.green.java.Nado06;

public class ForQuiz5 {
    public static void main(String[] args) {
        printGugudan(1, 8);
        //5x1 = 5
        //5x2 = 10
        //5x3 = 15
        //5x4 = 20


    }

    static void printGugudan(int num1, int num2) {
//
//        for (int i = 1; i < 10; i++) {
//            System.out.printf("%d X %d = %d\n",num,i,num*i);
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%d X %d = %d\n", i,j,j*i);

            }

        }

    }
}




