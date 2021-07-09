package com.itheima;
//将数组中的元素值交换并输出

public class 反转 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 50};

        /*
        //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        for (int start=0, end = arr.length-1; start<=end; start++, end--){
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        */

        //调用反转的方法
        reverse(arr);

        //遍历数组
        printArray(arr);
    }

    public static void reverse(int[] arr){
        //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
        for (int start=0, end=arr.length-1; start<=end; start++, end--){
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void printArray(int[] arr){
        System.out.println("[");

        for (int x=0; x< arr.length; x++){
            if (x == arr.length - 1){
                System.out.println(arr[x]);
            }else{
                System.out.println(arr[x] + ",");
            }
        }

        System.out.println("]");
    }
}
