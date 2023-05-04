package com.green.java.ch09;

public class WrapperStudy1 {
    public static void main(String[] args) {
        //primitive type
        //정수형 byte,short, int , long
        //실수형 float, double
        //문자형 char
        //불린형 boolean
        //Wrapper쓰는법은 앞글자만 대문자로 바꿔주면됨!

        Integer i1 = 10;
        int i2 = 10;

        String s1 = Integer.toString(i2);// toString이 static이다 toString의 리턴타입은 String이다
        String s2 = i1.toString();
        System.out.println(i1==i2);
        System.out.println(s1==s2);

        Byte b1 = 10;
        Short sh1 = 10;
        Long l1 = 10L;

        Float f1 = 10.1f;
        Double d1 = 10.1d;


        Character c1 = 'c';

        Boolean bl1 = true;
    }
}
