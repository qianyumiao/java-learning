package com.qianyu.test2;

/**
 * @Auther: qianyu
 * @Date: 2026/10/9 - 10 - 09 - 15:25
 * @Description: com.qianyu.test2
 * @version: 1.0
 */
public class Person {
    private int age;
    private String name;
    private String sex;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void sleep(){
        System.out.println("会睡觉。。。");
    }
    public void eat(){
        System.out.println("会吃饭。。。");
    }
}
