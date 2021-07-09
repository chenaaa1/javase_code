package com.itheima;
/*
    查看循环求偶数和的设计过程
*/

public class Debug {
    public static void main(String[] args) {
        //定义求和变量
        int sum =0;

        //循环偶数求和
        for(int i=1; i<10; i++){
            if(i % 2 == 0){
                sum+=i;
            }
        }

        //输出结果
        System.out.println("1到10之间的偶数和是：" + sum);
    }
}
