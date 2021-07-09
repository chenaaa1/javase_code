package com.itheima_03;

public class 拼接字符串 {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};

        //调用方法，用一个变量接受结果
        String s = arrayToString(arr);

        //输出结果
        System.out.println("s:" + s);
    }

    //定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回
    public static String arrayToString(int[] arr){
        //在方法中用StringBuilder按照要求进行拼接，并把结果转换为String返回
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i=0; i<arr.length; i++){
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }

        sb.append("]");

        String s = sb.toString();

        return s;
    }
}
