package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1 == nb2);// == 비교는 주소값비교 주소값이 달라서 false 둘다 new new를써서 다름
        System.out.println(r1);
        boolean r2 = nb1.equals(nb2);
        System.out.println("r2:"+r2);
    }
    }

class NumberBox extends Object{
    private int num;

    NumberBox(int num){
        this.num = num;
    }
    int getNum(){
        return num;
    }
    @Override
    public boolean equals(Object obj){//메소드 호출은 타입을 알고있는것만 호출 가능
        if(!(obj instanceof NumberBox)){
            return false;

        }
        NumberBox nb = (NumberBox)obj;
        nb.getNum();
        return this.num == nb.getNum();
    }
}