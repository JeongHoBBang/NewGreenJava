package com.green.java.Nado06;

public class ForQuiz3 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 0; i < star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println("----------");
        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

