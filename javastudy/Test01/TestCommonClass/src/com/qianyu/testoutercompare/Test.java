package com.qianyu.testoutercompare;


import java.util.Comparator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 14:32
 * @Description: com.qianyu.testcollection03.testcompare02
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Student s1 = new Student(14,175.6,"lili");
        Student s2 = new Student(18,182.6,"alice");
        Comparator bj1 = new BiJiaoAge();
        System.out.println(bj1.compare(s1, s2));
        Comparator bj2 = new BiJiaoDouble();
        System.out.println(bj2.compare(s1, s2));
        Comparator bj3 = new BiJiaoName();
        System.out.println(bj3.compare(s1, s2));
    }
}
