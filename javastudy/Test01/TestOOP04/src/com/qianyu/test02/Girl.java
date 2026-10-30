package com.qianyu.test02;

/**
 * @Auther: qianyu
 * @Date: 2026/10/12 - 10 - 12 - 10:51
 * @Description: com.qianyu.test02
 * @version: 1.0
 */
public class Girl {
    int age;
    String name;
    double weight;
    Mom m;
    public Girl(String name,int age,double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void love(Boy boy){
        System.out.println("我爱"+boy.getName());
    }

    @Override
    public String toString() {
        return "Girl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
