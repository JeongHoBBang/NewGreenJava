package com.green.java.ch04;

//p.159
public class FlowEx13Method {
    public static void main(String[] args) {
        //최소값~최대값사이의 값을 전부 더하고 출력
        //min값~max값 sum=값
        printAllSum(1,100);
        }

    public static void printAllSum(int min, int max){
        int sum=0;
        for (int i = min; i <= max; i++) {
            sum+=i;


        }
        System.out.printf("min값%d~max값%d sum=%d",min,max,sum);


    }
}
