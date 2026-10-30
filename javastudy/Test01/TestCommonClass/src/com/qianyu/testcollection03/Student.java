package com.qianyu.testcollection03;

import java.util.Comparator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 16:06
 * @Description: com.qianyu.testcollection03
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
    private int age;
    private double weight;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



class BiJiao implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}