package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        //중첩 for문을 이용하여 2~9단 구구단을 출력
        //단수가 바뀌면 빈칸 한 줄 추가
        //똑같은 이름의 메소드 여러개 만드는걸 오버로딩이라 한다. 오로지 파라미터랑만 상관있음.
        //보내는값은 arguments 아규먼츠,인수
        gugudan(3);
        gugudan(2,8);
    }

    public static void gugudan(int snum,int esnum) {//인자 파라미터,매개변수
        for (int i = snum; i <= esnum; i++) {
            gugudan(i);



        }
    }
    public static void gugudan(int num) {
        for (int i = 1; i < 10; i++) {
        /*    for (int z = 1; z < 10; z++) {
                System.out.printf("%d X %d = %d\n", i, z, (i * z));
            }
            System.out.println();*/
            System.out.printf("%dX%d=%d",num,i,(num*i));
            System.out.println();
        }
    }
}
