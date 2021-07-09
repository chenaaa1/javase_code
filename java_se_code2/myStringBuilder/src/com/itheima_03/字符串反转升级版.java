package com.itheima_03;

import java.util.Scanner;

public class 字符串反转升级版 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        //调用方法
        String s = myReverse(line);

        //输出结果
        System.out.println("s:" + s);
    }

    //定义一个方法，实现字符串反转，返回值类型String，参数String s
    public static String myReverse(String s){
        //在方法中用StringBuilder实现字符串的反转，并把结果转为String返回
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String ss = sb.toString();
//        return ss;

        return new StringBuilder(s).reverse().toString();
    }
}
