package com.itheima_02;

public class 多个数组内存图 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] arr2 = new int[3];
        //输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
        //给数组中的元素赋值
        arr[0] = 100;
        arr2[0] = 200;
        arr2[2] = 300;
        //再次输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
    }
}
