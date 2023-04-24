package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num);

        NumberBox nb = new NumberBox();//NumberBox 객체 주소값만 담을수 있음~
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num);

        NumberBox nb2 = new NumberBox();
        changeNum3(nb);
        System.out.println(nb2.num);



    }
    static void changeNum(int num){
        num=20;
    }
    static void changeNum2(NumberBox nb2){
        nb2.num = 20;
    }
    static void changeNum3(NumberBox nb2){
        nb2 = new NumberBox();
        nb2.num = 30;
    }
}
class NumberBox{
    int num;
}