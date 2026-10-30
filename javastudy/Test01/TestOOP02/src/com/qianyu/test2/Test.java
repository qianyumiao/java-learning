package com.qianyu.test2;

/**
 * @Auther: qianyu
 * @Date: 2026/10/9 - 10 - 09 - 15:26
 * @Description: com.qianyu.test2
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("莉莉");
        s1.setSex("女");
        System.out.println("我叫"+s1.getName()+"，我今年"+s1.getAge()+"岁了，是个"+s1.getSex()+"生");
        s1.study();
    }
}
