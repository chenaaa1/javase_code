package com.itheima_03;

public class 带返回值的方法的定义和调用 {
    public static void main(String[] args) {
        //1:方法名（参数）;
        //isEvenNumber(10);
        //true;

        //2.数据类型 变量名 = 方法名（参数）;
        boolean flag = isEvenNumber(10);
        //boolean flag = true;
        System.out.println(flag);
    }

    //需求：定义一个方法，接受一个参数，判断该数据是否是偶数，并返回真假值
    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
