package com.qianyu.testpizza;

/**
 * 水果披萨。
 *
 * @author qianyu
 * @version 1.0
 */
public class FruitPizza extends Pizza {
    private String fruit;

    public FruitPizza() {
    }

    public FruitPizza(String name, int size, int price, String fruit) {
        super(name, size, price);
        this.fruit = fruit;
    }

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("您加入的水果为：" + fruit);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
