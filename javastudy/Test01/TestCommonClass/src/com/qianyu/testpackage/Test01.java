package com.qianyu.testpackage;

/**
 * @Auther: qianyu
 * @Date: 2026/10/17 - 10 - 17 - 17:19
 * @Description: com.qianyu.testpackage
 * @version: 1.0
 */
public class Test01 {
    static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        Integer i3 = 2;
        Integer i4 = 2;
        Integer i5 = 1;
        System.out.println(i3 == i4);
        System.out.println(i1 == i5);
        System.out.println(i1.compareTo(i2));
        boolean flag1 = i3.equals(i4);
        System.out.println(flag1);
        System.out.println(i1.compareTo(i5));
        boolean flag2 = i4.equals(i5);
        System.out.println(flag2);
        int num1 = i1.intValue();
        System.out.println(num1);
        System.out.println(Integer.parseInt("13"));
        String s1 = i2.toString();
        System.out.println(s1);
        System.out.println(Integer.reverse(91));

    }
}
