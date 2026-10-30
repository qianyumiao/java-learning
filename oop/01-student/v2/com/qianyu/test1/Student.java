package com.qianyu.test1;

public class Student {
    private int age;
    private String name;
    private String sex;
    public Student(){
    }
    public Student(String name,int age,String sex){
        this.name = name;
        setSex(sex);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if("女".equals(this.sex) && (age>16&&age<25)){
            this.age = age;
        } else if ("女".equals(this.sex) && age>25) {
            this.age = 18;
            System.out.println("女孩子永远是18岁哦！");
        } else if ("女".equals(this.sex) && age<16) {
            this.age = age;
            System.out.println("未成年！");
        }else{
            this.age = age;
        }

    }
    public void setSex(String sex){
        if ("男".equals(sex) || "女".equals(sex)){
            this.sex = sex;
        }else{
            this.sex = "男";
            System.out.println("您输入的性别有误，已默认为男");
        }
    }
    public String getSex(){
        return sex;
    }
}
