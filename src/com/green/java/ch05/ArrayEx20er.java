package com.green.java.ch05;

import java.util.Scanner;

public class ArrayEx20er {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0,y=0;

        char[][] board = new char[SIZE][SIZE];
        byte[][]shipBoard = {
                {0,0,0,0,0,0,1,0,0},
                {1,1,1,1,0,0,1,0,0},
                {0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,0,0},
                {1,1,0,1,0,0,0,0,0},
                {0,0,0,1,0,0,0,0,0},
                {0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,0},
        };
        for (int i = 0; i < SIZE; i++)
            board[0][i]=board[i][0]=(char)(i+'0');
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input = scanner.nextLine();

            if(input.length()==2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';
                if (x == 0 && y == 0)
                    break;
            }



        }
    }
}
