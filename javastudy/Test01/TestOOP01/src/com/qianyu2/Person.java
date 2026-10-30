package com.qianyu2;

/**
 * @Auther: qianyu
 * @Date: 2026/10/6 - 10 - 06 - 17:49
 * @Description: com.qianyu2
 * @version: 1.0
 */
public class Person {
    String name;
    int age;
    double height;
    double weight;
    String address;
    public Person(){

    }
    public Person(String name,int age,double height,double weight,String address){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }
    public void introduce(){
        System.out.println("你好,我叫"+name+",今年"+age+"岁了,身高为"+height+",体重是"+weight+",目前在"+address+"读书,请大家多多指教！");
    }
}
