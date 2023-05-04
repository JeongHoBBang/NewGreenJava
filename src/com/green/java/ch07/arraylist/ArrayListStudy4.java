package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStudy4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//0번방
        list.add(20);//1번방
        list.add(30);

        list.set(1,50);
        //Wrapper
        System.out.println(list.contains(10));//contains는 내가 찾는값이 배열안에 있을때 씀

        System.out.println(list);

        Integer[] arr2 ={10,20,30};
        System.out.println(Arrays.asList(arr2).contains(10));


    }
}
