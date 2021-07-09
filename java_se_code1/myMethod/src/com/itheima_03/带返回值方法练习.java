package com.itheima_03;

public class 带返回值方法练习 {
    public static void main(String[] args) {
        //在main方法中调用定义好的方法并使用变量保存
        int result =  getMax(10, 20);
        System.out.println(result);

        //在mian方法中调用定义好的方法并直接打印结果
        System.out.println(getMax(10, 20));
    }

    //定义一个方法，用于获取两个数字中的较大数
    public static int getMax(int a, int b){
        //对两个数字大小进行处理
        //设置两种情况下的返回结果
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
