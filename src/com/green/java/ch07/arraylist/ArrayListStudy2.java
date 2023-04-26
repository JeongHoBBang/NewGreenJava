package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2{
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = a;

        double d = 10.2;
        Double d2 = d;

        //generic 제네릭
        ArrayList<Integer>List = new ArrayList<>();//int형으로 받고 int형으로 받아냄,정수값만 받아낼수 있음.
        //List.add("11");
        //List.add(true);
        List.add(10);
        List.add(13);

        int n1 = List.get(0);
        System.out.println(List);//Tostring이 override되있음
    }
}
