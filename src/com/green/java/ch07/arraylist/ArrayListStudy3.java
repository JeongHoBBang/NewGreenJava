package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        System.out.println(List);

        List.add(1,100);//1번자리에 100을줌 원래있떤 1번자리는 2번자리로 쭉 밀림
        List.add(0,300);
        System.out.println(List);

        int removeValue = List.remove(4);//4번방 값을 없에고 4번방에 있는값을 value에 리턴함
        System.out.println("removeValue : "+removeValue);

        System.out.println(List);

        System.out.println(List.size());//몇개인줄 알게함 리턴메소드임. 리턴타입은 int!
    }
}





