package com.green.java.ch07.Poly;
//p.354 다형성은 상속관계에서만 의미 있음
public class Poly {
    /*
    1.부모타입은 자식 객체 주소값 저장할 수 있다.
    2.자식타입은 부모 객체 주소값 저장할 수 없다.
    3.타입은 (알고있는 메소드를 호출할 수 있음)
            (메소드를 호출할수 있나없나만) 결정 > 실제로 실행되는 건 객체 기준이다.

            다중상속을 허용하지 않는 이유 - 다중상속을 하였을 때
     */
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.crying();

        ani = new Animal();
        Dog dog1 = (Dog)ani; //자동 형변환 안해줘서 내가 (Dog)넣어 줘야함
        dog1.crying();
        //dog1.equals("");
        dog1.jump();

    }
}
