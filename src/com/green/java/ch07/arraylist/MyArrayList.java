package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
        // System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];
        temp[items.length] = value;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;

//        for (int i = 0; i < items.length; i++) {
//            temp[i] = items[i];
//        }
//        temp[temp.length - 1] = value;


//    public void myList() {
//        for (int i : items) {
//            System.out.println(i);
    }

    public void add(int idx, int value) {
        if (idx > items.length) {
            return;
        }
        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }

        }
        items = temp;
    }

    @Override
    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += "," + items[i];

            }
        }

        str += "]";
        return str;


    }

    public int size() {
        return items.length;
    }

    public int get(int idx) {

        return items[idx];
    }

    public void bubbleSort() {
        for (int i = items.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                int sideIdx = z + 1;
                if (items[z] > items[sideIdx]) {
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;


                }


            }

        }
    }

    public void set(int num1, int num2) {
        items[num1] = num2;

    }

    public boolean contains(int num) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == num) {
                return true;
            } else {
            }
        }return false;
    }
}












