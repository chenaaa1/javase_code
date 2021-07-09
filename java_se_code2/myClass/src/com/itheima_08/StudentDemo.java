package com.itheima_08;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("张丽莎");
        s2.show();

        Student s4 = new Student("张丽莎", 20);
        s4.show();
    }
}
