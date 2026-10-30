package com.qianyu.testpizza;

/**
 * @Auther: qianyu
 * @Date: 2026/10/15 - 10 - 15 - 10:20
 * @Description: com.qianyu.testpizza
 * @version: 1.0
 */
public class FruitPizza extends Pizza{
    private String fruit;
    public FruitPizza(){

    }
    public FruitPizza(String name,int size,int price,String fruit){
        super(name,size,price);
        this.fruit = fruit;
    }

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.print("您加入的水果为："+fruit);
    }
}
