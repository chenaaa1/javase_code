package com.itheima;

public class 逢七过 {
    public static void main(String[] args) {
        //数据在1到100之间，用for循环实现数据的获取
        for (int x=1;x<=100;x++){
            //根据规则，用if语句实现数据的判断，要么个位是7，要么十位是7，要么能够被7整除
            if (x%10==7 || x/10%10==7 || x%7==0){
                //在控制台中输出满足规则的数据
                System.out.println(x);
            }
        }
    }
}
