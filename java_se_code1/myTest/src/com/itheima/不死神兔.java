package com.itheima;
/*
一对兔子出生后3月后每个月生一对兔子，小兔子长到3月后
又生一对兔子，兔子都不死，求20个月后兔子对数
*/
public class 不死神兔 {
    public static void main(String[] args) {
        /*为了存储多个月数字对数，定义一个数组，用动态
        初始化完成数组元素的初始化，长度为20 */
        int[] arr = new int[20];

        //因为第1个月，第二个月兔子的对数是已知的，都是1，
        //所以数组的1，2个元素都是1
        arr[0] = 1;
        arr[1] = 1;

//        arr[2] = arr[0] + arr[1];
//        arr[3] = arr[1] + arr[2];
//        arr[4] = arr[2] + arr[3];
        //用循环实现计算每个月兔子对数
        for (int x=2; x<arr.length; x++){
            arr[x] = arr[x-2] + arr[x-1];
//          arr[2] = arr[0] + arr[1];
//          arr[3] = arr[1] + arr[2];
//          arr[4] = arr[2] + arr[3];
//            ...
        }

        //输出数组中最后一个元素的值，就是第20个月的兔子对数
        System.out.println("第20个月兔子的对数是: " + arr[19]);
    }
}
