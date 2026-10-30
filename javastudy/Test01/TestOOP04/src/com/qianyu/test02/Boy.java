package com.qianyu.test02;

/**
 * @Auther: qianyu
 * @Date: 2026/10/12 - 10 - 12 - 10:51
 * @Description: com.qianyu.test02
 * @version: 1.0
 */
public class Boy {
    private int age;
    private String name;
    private double height;

    public Boy(String name,int age,double height){
        setAge(age);
        setHeight(height);
        setName(name);
    }

    public void buy(){
        System.out.println("做我女朋友，我给你买买买。。。");
    }
    public void love(Girl g){
        System.out.println("我的女朋友是"+g.name+",她"+g.age+"岁了,"+"体重"+g.weight+"斤。");
    }
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
}
