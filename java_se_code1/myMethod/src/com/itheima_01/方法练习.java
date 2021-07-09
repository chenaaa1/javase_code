package com.itheima_01;

public class 方法练习 {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法
        getMax();
    }

    //定义一个方法，用于打印两个数字中的最大数
    public static void getMax(){
        int a = 10;
        int b = 20;

        //使用分支语句分两种情况对两个数字大小进行处理
        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
