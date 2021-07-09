package com.itheima_03;
//多个对象

public class StudentTest_02 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();

        s1.name = "张丽莎";
        s1.age = 20;
        System.out.println(s1.name + "," + s1.age);

        s1.study();
        s1.dohomework();

        //创建第二个对象并使用
        Student s2 = new Student();

        s2.name = "丽莎";
        s2.age = 18;
        System.out.println(s2.name + "," + s2.age);

        s2.study();
        s2.dohomework();
    }
}
