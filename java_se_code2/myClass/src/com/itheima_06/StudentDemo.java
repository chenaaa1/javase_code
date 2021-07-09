package com.itheima_06;

import com.itheima_05.Student;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成员变量赋值
        s.setName("张丽莎");
        s.setAge(20);

        //调用show方法
        s.show();
    }
}
