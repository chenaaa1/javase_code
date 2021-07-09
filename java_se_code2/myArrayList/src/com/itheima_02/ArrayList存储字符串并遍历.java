package com.itheima_02;

import java.util.ArrayList;

public class ArrayList存储字符串并遍历 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //往集合中添加字符串对象
        array.add("张丽莎");
        array.add("超好看");
        array.add("超漂亮");

        //遍历集合，首先要能够获取到集合中 的每一个元素，通过get(int index）方法实现
        //遍历集合，其次要获取到集合的长度，用size（）方法实现

        //遍历集合的通用格式
        for (int i=0; i<array.size(); i++){
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
