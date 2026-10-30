package com.qianyu.testoutercompare;

import java.util.Comparator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 14:32
 * @Description: com.qianyu.testcollection03.testcompare02
 * @version: 1.0
 */
public class Student {
    private int age;
    private double height;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
}