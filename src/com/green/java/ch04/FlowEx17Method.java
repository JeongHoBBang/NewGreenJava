package com.green.java.ch04;

//*
//**
//***
//****
//*****
public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 5;
        printStarLine(star);
        printStarLine(1);
        printStarRect(4);
        printStarTri(4);

        //*
        //**
        //***
        //****

    }

    static void printStarLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");

            /*for (int z = 0; z <= i; z++) {
                System.out.print("*");*/
        }
        System.out.println();


    }


    public static void printStarRect(int star) {
        for (int i = 0; i < star; i++) {
            printStarLine(star);
        }
        System.out.println();
    }


    public static void  printStarTri(int star){
        for (int i = 0; i <= star; i++) {
            printStarLine(i);

        }
    }
}




