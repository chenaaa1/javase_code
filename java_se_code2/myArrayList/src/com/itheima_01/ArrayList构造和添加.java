package com.itheima_01;

import java.util.ArrayList;

public class ArrayList构造和添加 {
    public static void main(String[] args) {
        //public ArrayList();创建一个空的集合对象

        ArrayList<String> array = new ArrayList<String>();

        //public boolean add(E e);将指定的元素追加到此集合的末尾
        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add(int index,E element);在此集合中的指定位置插入指定代码
        array.add(3,"javase");

        //IndexOutOfBoundsException
//        array.add(4,"javaee");

        //输出集合
        System.out.println("array:" + array);
    }
}
