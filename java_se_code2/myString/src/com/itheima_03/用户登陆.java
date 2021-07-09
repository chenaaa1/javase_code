package com.itheima_03;

import java.util.Scanner;

public class 用户登陆 {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示即可
        String username = "张丽莎";
        String password = "chenaaa";

        //用循环实现多次机会，这里的次数明确，采用for循环实现，并在登陆成功的时候，使用break结束循环
        for(int i=0; i<3; i++){

            //键盘录入要登陆的用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            //将录入的数据与已知数据相比较，用equal（）方法实现
            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登陆成功");
                break;
            }else{
                if(2-i == 0){
                    System.out.println("你的账户被锁定，请remake吧");
                }else{
                    System.out.println("登陆失败，你还有" + (2-i) + "次机会");
                }
            }
        }
    }
}
