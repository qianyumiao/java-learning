package com.qianyu.test1;

import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/10/9 - 10 - 09 - 11:15
 * @Description: com.qianyu.Test1
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int age = sc.nextInt();
        String sex = sc.next();
        Student s1 = new Student(str,age,sex);
        System.out.println(s1.getName()+"----"+s1.getAge()+"----"+s1.getSex());
    }
}
