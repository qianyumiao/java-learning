package com.qianyu.teat02;

/**
 * @Auther: qianyu
 * @Date: 2026/10/13 - 10 - 13 - 17:58
 * @Description: com.qianyu.teat02
 * @version: 1.0
 */
public abstract class Person {
    final String Name = "lili";
    public void run(){
        System.out.println("我会跑步~");
    }
    public abstract void sleep();
    public abstract void eat();
}
