package com.itheima;
//有一个数组{68，27，95，88，171，996，51，210}。求该数组中满足
//要求的元素和，要求是求和的元素个位和十位都不能是7，并且只能是偶数

public class 数组元素求和 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr ={68, 27, 95, 88, 171, 996, 51, 210};

        //定义一个求和变量，初始值是0
        int sum = 0;

        //遍历数组，获取到数组中的每一个元素
        for (int x=0; x<arr.length; x++){
            //判断该元素是否满足条件，如果满足就累加
            if (arr[x]%10!=7 && arr[x]/10%10!=7 && arr[x]%2==0){
                sum += arr[x];
            }
        }

        //输出求和变量的值
        System.out.println("sum:" + sum);
    }
}
