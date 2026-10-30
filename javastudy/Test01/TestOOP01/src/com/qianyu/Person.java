package com.qianyu;

/**
 * @Auther: qianyu
 * @Date: 2026/10/6 - 10 - 06 - 15:32
 * @Description: com.qianyu
 * @version: 1.0
 */
public class Person {
    //名词-----属性
    int age;
    String name;
    double height;
    double weight;
    //动词-----方法
    public  void eat(){
        System.out.println("我喜欢吃饭");
    }
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }
    public String introduce(){
        return "我的名字是"+name+",我的年龄是"+age+",我的身高是"+height+",我的体重是"+weight;
    }
}
