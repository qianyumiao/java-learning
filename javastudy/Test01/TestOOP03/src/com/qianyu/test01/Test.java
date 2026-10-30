package com.qianyu.test01;

/**
 * @Auther: qianyu
 * @Date: 2026/10/11 - 10 - 11 - 17:14
 * @Description: com.qianyu.test01
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Phone p1 = new Phone("小米18",5999.9,2026);
        Phone p2 = new Phone("小米18",5999.9,2026);
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
    }
}
