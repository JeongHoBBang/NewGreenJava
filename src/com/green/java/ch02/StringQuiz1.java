package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullfileNm = "new.jeans.jpg";
        String fileNm,ext;
        int idx = fullfileNm.lastIndexOf(".");
        fileNm = fullfileNm.substring(idx+1);
        ext = fullfileNm.substring(0,idx);
        System.out.println(ext);
        System.out.println(fileNm);
    }
}