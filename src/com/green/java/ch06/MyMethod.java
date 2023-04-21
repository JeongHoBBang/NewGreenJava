package com.green.java.ch06;

public class MyMethod {
    //void >return type,리턴타입
    //void는 뱉어내는곳이 없음
    //sum > method name,메소드명
    //(int n1, int n2) >parameter, 파라미터, 한국어로 매개변수
    //parameter는 값을 받는곳 ex출입구,항구
    void sum(int n1, int n2){//<메소드의 선언부
     //{}중괄호 시작부터 끝날때까진 구현부
        if(n2==22){
            return;
        }
        System.out.println(n1 + n2);

    }
    int sum2(int n1, int n2){
        return n1+n2;
    }//int는 변환타입, int n1, int n2,는 기입되는 타입 return n1+n2는 n1+n2를 반환한다.
}
