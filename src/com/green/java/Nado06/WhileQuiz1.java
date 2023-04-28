package com.green.java.Nado06;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("숫자를 입력 (종료:0)>");
            int input = scan.nextInt();
            sum += input;
            if (input == 0) {
                break;
            }
        }System.out.println("합계 :" + sum);
    }
    }