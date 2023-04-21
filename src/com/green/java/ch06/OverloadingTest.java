package com.green.java.ch06;
//오버로딩은 오로지 이름과 매개변수만 상관있음;
public class OverloadingTest {
    public static void main(String[] args) {
       // sum(1,2,3,4,5,6);6뒤에 L넣으면 2번째 안넣으면 3번째!
    }
    public static void sum(int n1, int n2){
        System.out.println(n1+n2);
    }
    public static void sum(int n1, int n2, long n3){
        System.out.println(n1+n2+n3);
    }
    public static int sum(int k1, int k2, int k3){
        return k1+ k2+ k3;
    }
}

