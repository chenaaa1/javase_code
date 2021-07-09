package com.itheima_02;
//public StringBuilder append(任意类型);添加数据，并返回对象本身
//public StringBuilder reverse();返回相反的字符序列

public class StringBuilder添加和反转 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();

//        sb.append("hello");
//        sb.append("world");
//        sb.append("java");

        //链式编程
        sb.append("hello").append("world").append("java");

        System.out.println("sb:" +sb);

        //public StringBuilder reverse();返回相反的字符序列
        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
