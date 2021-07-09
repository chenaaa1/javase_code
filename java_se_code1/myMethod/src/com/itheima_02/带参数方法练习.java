package com.itheima_02;

public class 带参数方法练习 {
    public static void main(String[] args) {
        //在main方法中调用定义好的方法（使用常量）
        getMax( 10, 20);
        //这里是直接输入常数，黑色的是系统提示不是真实输入的a，b
        //调用方法时，输入的个数和类型要相符合;
        //getMax(30);
        //getMax(10.0,20.0);

        //在main()方法中调用定义好的方法（使用变量）
        int a = 10;
        int b = 20;
        getMax(a, b);
    }

    //定义一个方法，用于打印两个数字中的较大数
    //为方法定义两个数字，用于接受两个数字
    public static void getMax(int a, int b){
        //使用分支语句对数字大小进行处理
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
