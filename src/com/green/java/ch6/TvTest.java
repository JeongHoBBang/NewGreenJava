package com.green.java.ch6;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");
        Tv tv = new Tv();//Tv 주소값만 저장할수있는 레퍼런스 변수 Tv를 new로 객체화 한것
        System.out.printf("power:%b\n", tv.power);//객체에 접근할수 있또록 하는것이 .이다.
        System.out.printf("channel:%d\n",tv.channel);

        tv.power=true;
        System.out.printf("power:%b\n",tv.power);
        tv.power();
        System.out.printf("power:%b\n",tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel:%d\n",tv.channel);
        tv.channel = 10;
        System.out.printf("channel:%d\n",tv.channel);

        Tv tv2 = tv;
        System.out.printf("channel:%d\n",tv.channel);
    }
}
