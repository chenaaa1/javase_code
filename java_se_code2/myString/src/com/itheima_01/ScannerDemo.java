package com.itheima_01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接受数据
        System.out.println("请输入一个字符串数据");
//        String line = sc.nextLine();
//        ctrl+alt+v可以自动补全sc.nextline（）
        String line = sc.nextLine();

        //输出结果
        System.out.println("你输入的数据是: " + line);
    }
}
