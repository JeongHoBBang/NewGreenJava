package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList List = new ArrayList();
        List.add(10);//0번방
        List.add(20);//1번방
        List.add("ddd");
        Object obj = 10;
        System.out.println(List.get(0));
        System.out.println(List.get(1));
        System.out.println(List.get(2));

        int n1 = (int)List.get(0);
        int n2 = (int)List.get(1);
        String str1 = (String)List.get(2); //오브젝트 타입이라 강제로 형변환 해줘야함





    }

}
