package com.itheima_09;

public class StudentDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setxxx赋值
        Student s1 = new Student();
        s1.setName("张丽莎");
        s1.setAge(20);
        s1.show();

        //使用带参构造方法直接创建带有属性值的对象
        Student s2 = new Student("张丽莎", 18);
        s2.show();
    }
}
