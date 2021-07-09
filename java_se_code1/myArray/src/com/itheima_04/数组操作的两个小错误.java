package com.itheima_04;

public class 数组操作的两个小错误 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //索引越界
        System.out.println(arr[3]);

        //把null值赋给数组，会造成空指针异常
        arr = null;
        System.out.println(arr[0]);

    }
}
