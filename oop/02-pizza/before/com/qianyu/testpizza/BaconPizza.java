package com.qianyu.testpizza;

/**
 * @Auther: qianyu
 * @Date: 2026/10/15 - 10 - 15 - 10:32
 * @Description: com.qianyu.testpizza
 * @version: 1.0
 */
public class BaconPizza extends Pizza{
    private double weight;
    public BaconPizza(){

    }
    public BaconPizza(String name,int size,int price,double weight){
        super(name,size,price);
        this.weight = weight;
    }

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.print("您加入了"+weight+"克的培根。");
    }
}
