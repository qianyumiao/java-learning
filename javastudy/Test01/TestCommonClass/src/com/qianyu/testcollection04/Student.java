package com.qianyu.testcollection04;

/**
 * @Auther: qianyu
 * @Date: 2026/10/29 - 10 - 29 - 10:30
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private double height;

    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

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
}
