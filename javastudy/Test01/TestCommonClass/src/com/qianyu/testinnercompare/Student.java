package com.qianyu.testinnercompare;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 14:14
 * @Description: com.qianyu.testcollection03.testcpmpare
 * @version: 1.0
 */
public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        return ((Double)(this.getHeight())).compareTo((Double)(o.getHeight()));
    }
}
