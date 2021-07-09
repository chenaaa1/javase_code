package com.itheima_04;

public class 方法的注意事项 {
    public static void main(String[] args) {

    }

    public static void methodOne(){

    }

    public static void methodTwo(){
        //return 100;  会报错

        return; //不会报错

        //System.out.println(100);
        //上面已经return出去了，所以下面的语句无法运行
    }
}
