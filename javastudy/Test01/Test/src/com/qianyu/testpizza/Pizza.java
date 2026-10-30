package com.qianyu.testpizza;

/**
 * @Auther: qianyu
 * @Date: 2026/10/15 - 10 - 15 - 10:13
 * @Description: com.qianyu.testpizza
 * @version: 1.0
 */
public class Pizza {
    private int price;
    private String name;
    private int size;

    public Pizza(){

    }
    public Pizza(String name,int size,int price){
        this.name = name;
        this.size = size;
        this.price = price;
    }
    public void showPizza(){
        System.out.println("您好，您点的"+size+"英寸的"+name+"披萨好了，价格是"+price+"元。");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
