package com.qianyu.test1;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String sex = sc.next();
        int age = sc.nextInt();
        Student s1 = new Student(str,age,sex);
        System.out.println(s1.getName()+"----"+s1.getAge()+"----"+s1.getSex());
    }
}
