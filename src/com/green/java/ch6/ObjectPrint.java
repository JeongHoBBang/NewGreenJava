package com.green.java.ch6;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("Abc");
        System.out.println(str);

        ValueBox vb = new ValueBox();
        vb.num=10;
        System.out.println(vb);

    }
}
class ValueBox{
    int num;

    public String toString(){
        return"num:"+num;
    }
}