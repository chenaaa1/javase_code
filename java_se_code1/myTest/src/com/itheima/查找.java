package com.itheima;
//已知一个数组,家农安录入数据,查找该数据在数组中的索引并输出索引值

import java.util.Scanner;

public class 查找 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 50};

        //键盘录入要查找的数据，用一个变量接受
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要查找的数据");
        int number = sc.nextInt();

        /*
        //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for (int x=0; x<arr.length; x++){
            //拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同则输出其索引值
            if (arr[x] == number){
                index = x;
                break;
            }
        }
        */

        //调用方法
        int index = getIndex(arr, number);

        //输出索引变量
        System.out.println("index: " +index);
    }

    //查找指定的数据在数组中的索引
    public static int getIndex(int[] arr, int number){
        //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for (int x=0; x<arr.length; x++){
            //拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同则输出其索引值
            if (arr[x] == number){
                index = x;
                break;
            }
        }

        //返回索引
        return index;
    }

}
