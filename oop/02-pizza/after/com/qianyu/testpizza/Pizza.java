package com.qianyu.testpizza;

/**
 * 披萨基类。
 *
 * @author qianyu
 * @version 1.0
 */
public class Pizza {
    private String name;
    private int size;
    private int price;

    public Pizza() {
    }

    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    /**
     * 输出披萨信息，子类覆盖后可追加配料信息。
     */
    public void showPizza() {
        System.out.println("您好，您点的" + size + "英寸的" + name + "好了，价格是" + price + "元。");
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
