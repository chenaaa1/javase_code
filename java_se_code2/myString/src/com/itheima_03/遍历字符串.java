package com.itheima_03;

import java.util.Scanner;

public class 遍历字符串 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        //遍历字符串
        for (int i=0; i<line.length(); i++){
            //打印指定索引处的字符值
            System.out.println(line.charAt(i));
        }
    }
}
