package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;
        int sum=0;
        MyMathInstance m1 = new MyMathInstance();
        int r1 = m1.sum(n1,n2);
        System.out.println(r1);
        int r2 = MyMathStatic.sum(n1,n2);
        System.out.println(r2);
        //MyMathInstance 클래스에 있는 sum메소드 이용하여 n1,n2값을
        // 더한 결과를 콘솔에 출력
        //MyMathStatic 클래스에 있는 sum메소드 이용하여 n1,n2값을
        // 더한 결과를 콘솔에 출력
    }
}
