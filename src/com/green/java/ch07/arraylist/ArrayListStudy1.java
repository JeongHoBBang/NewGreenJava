package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        List List = new ArrayList();//아무거나 다 들어가서 내가 뭘넣었는지 기억해야함. 상속관계 타입이 다른데 값을 넣을수 있어서
        List.add(10);//0번방
        List.add(20);//1번방
        List.add("ddd");//정수저장하다 스트링 저장하면 타입이 오브젝트 밖에 없음
        Object obj = 10;
        System.out.println(List.get(0));
        System.out.println(List.get(1));
        System.out.println(List.get(2));

        int n1 = (int)List.get(0);
        int n2 = (int)List.get(1);
        String str1 = (String)List.get(2); //오브젝트 타입이라 강제로 형변환 해줘야함





    }

}
