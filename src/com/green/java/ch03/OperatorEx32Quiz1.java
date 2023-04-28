package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;
        OperatorEx32Quiz1 gt = new OperatorEx32Quiz1();
        absX = gt.getAbs(x);
        absY = gt.getAbs(y);
        absZ = gt.getAbs(z);

        System.out.println("absX : "+absX);
        System.out.println("absY : "+absY);
        System.out.println("absZ : "+absZ);
    }
    public int getAbs(int num1) {
        return num1>0 ? num1 : -num1;
//        if (num1 < 0){
//            return -num1;
//        }
//            return num1;
    }
}
