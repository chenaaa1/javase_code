package com.itheima_02;

public class StringBuilder和String的相互转换 {
    public static void main(String[] args) {
/*
//        StringBuilder转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

   //public String toString();通过toString()就可以把StringBuilder转换为String
        String s = sb.toString();
        System.out.println(s);
        */

        //String 转换为StringBuilder
        String s = "hello";

        //public StringBuilder(String s);通过构造方法就可以实现把String转换为StringBuilder
        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb);
    }
}
