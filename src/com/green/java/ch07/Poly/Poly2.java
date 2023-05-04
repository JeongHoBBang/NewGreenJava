package com.green.java.ch07.Poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani = new Bulldog();
        boolean r1 = ani instanceof Bulldog;//instanceof는 확인할떄씀
        System.out.println("r1:"+r1);
        Bulldog bd1 = (Bulldog)ani;

        System.out.println("r2:"+(ani instanceof Cat));
        //Cat c1 = (Cat)ani1;
    }
}
