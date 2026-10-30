package com.qianyu.testinnercompare;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 14:17
 * @Description: com.qianyu.testcollection03.testcpmpare
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Student s1 = new Student(14,175.6,"lili");
        Student s2 = new Student(18,182.6,"alice");
        System.out.println(s1.compareTo(s2));

    }
}
