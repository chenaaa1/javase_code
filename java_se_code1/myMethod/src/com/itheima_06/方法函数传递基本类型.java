package com.itheima_06;
// 形参的改变不影响实际参数的值

public class 方法函数传递基本类型 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前: " + number);
        change(number);
        System.out.println("调用change方法后: " + number);
    }

    public static void change(int number){
        number = 200;
    }
}
