package com.itheima_02;

public class 带参数方法的定义和调用 {
    public static void main(String[] args) {
        //常量值的调用
        isEvenNumber(10);

        //变量的调用
        int number = 10;
        isEvenNumber(number);
    }

    //定义一个方法，接受一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number){
        if(number%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
