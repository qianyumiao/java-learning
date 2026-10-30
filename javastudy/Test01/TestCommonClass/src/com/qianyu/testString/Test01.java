package com.qianyu.testString;

/**
 * @Auther: qianyu
 * @Date: 2026/10/21 - 10 - 21 - 15:02
 * @Description: com.qianyu.testString
 * @version: 1.0
 */
public class Test01 {
    static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a"+"bc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
        StringBuilder sb = new StringBuilder("abc");
        sb = sb.append("def");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.insert(2, "喵"));
        System.out.println(sb.deleteCharAt(1));
        String s4 = sb.toString();
        System.out.println(s3.equals(s4));
        Integer i = new Integer(600);
    }
}
