package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {
        String str = new String("dd");
        Tv tv = new Tv();//Tv 주소값만 저장할수있는 레퍼런스 변수 Tv를 new로 객체화 한것
        System.out.printf("power:%b\n", tv.power);//객체에 접근할수 있또록 하는것이 .이다.
        System.out.printf("channel:%d\n",tv.channel);

        tv.power=true;//tv메소드 호출
        System.out.printf("power:%b\n",tv.power);
        tv.power();
        System.out.printf("power:%b\n",tv.power);

        tv.channelUp();//tv객체에있는 channel메소드를 호출
        tv.channelUp();
        System.out.printf("channel:%d\n",tv.channel);
        tv.channel = 10;
        System.out.printf("channel:%d\n",tv.channel);

        Tv tv2 = tv;//tv변수에 들어있는 주소값을 복사하여 tv2에 준거 쉘로우카피(얕은 복사)
        System.out.printf("channel:%d\n",tv.channel);
    }
}
