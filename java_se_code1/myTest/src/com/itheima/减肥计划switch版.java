package com.itheima;
/*导包:
    手动导包 import java.util.Scanner;
    快捷键导包 鼠标放在字母上按alt+enter
    自动导包 自动补全时也会自动进行导包
*/

import java.util.Scanner;

public class 减肥计划switch版 {
    public static void main(String[] args) {
        //键盘录入一个星期数，用一个变量接收
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数");
        int week = sc.nextInt();

        //对星期数进行判断，这里用switch语句实现
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("大吃特吃！");
                break;
            default:
                System.out.println("你输入的是什么牛马");

        }
    }
}
