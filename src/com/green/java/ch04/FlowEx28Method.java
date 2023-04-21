package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28Method {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1,3);
        System.out.println(answer);

        do {
            System.out.print("1~100사이의 정수를 입력: ");
            input = scan.nextInt();

            if(input > answer) {
                System.out.println("down");
            } else if(input < answer) {
                System.out.println("up");
            }

        } while(input != answer);
        System.out.println("good!");
    }
    public static int getRandomNumber(int min, int max){
        return (int)(Math.random() *max-min+1) + min;


    }}

