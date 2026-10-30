package com.qianyu.test03;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TestClass to = new TestClass();

        // ① 用父类型 Comparable 接收 —— 这是方法签名允许的唯一"正规"拿法
        Comparable b = to.b();
        System.out.println("拿到对象了，实际类型 = " + b.getClass().getName());
        System.out.println("还能当 Comparable 用: compareTo = " + b.compareTo("x"));

        // ② 想调局部类自己独有的 c()：编译期类型是 Comparable，必须反射
        Method m = b.getClass().getDeclaredMethod("c");
        m.setAccessible(true);
        m.invoke(b);

        // ③ 反例，编译不过：出了方法体就不认识 a 这个名字
        // a x = to.b();

        // 顺便把别的成员跑一遍
        TestClass.A h = to.new A();
        to.a();
        h.a();
        h.method();
        TestClass.B sb = new TestClass.B();
        sb.method();
    }
}
