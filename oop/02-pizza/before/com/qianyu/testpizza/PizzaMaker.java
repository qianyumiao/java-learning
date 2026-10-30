package com.qianyu.testpizza;

import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/10/15 - 10 - 15 - 10:37
 * @Description: com.qianyu.testpizza
 * @version: 1.0
 */
public class PizzaMaker {
    public static Pizza make(String name) {
        Scanner sc = new Scanner(System.in);
        Pizza p = null;
        switch (name) {
            case "水果披萨": {
                System.out.println("请输入你想要的披萨的尺寸大小：");
                int size = sc.nextInt();
                System.out.println("请输入你想要的水果：1.芒果  2.菠萝  3.榴莲");
                String fruit = sc.next();
                int price = 0;
                switch (fruit){
                    case "芒果" :
                    {
                        price = 90;break;
                    }
                    case "菠萝":
                    {
                        price = 95;break;
                    }
                    case "榴莲":
                    {
                        price = 120;break;
                    }
                    default:
                        System.out.println("您录入信息有误，请重试！");
                }
                p = new FruitPizza(name, size, price, fruit);
            }break;
            case "培根披萨":
            {
                System.out.println("请输入你想要的披萨的尺寸大小：");
                int size = sc.nextInt();
                System.out.println("请录入你想要的培根的重量");
                int weight = sc.nextInt();
                int price = 60+2*weight;
                p = new BaconPizza(name,size,price,weight);
            }break;
            default:
                System.out.println("您录入信息有误，请重试！");
        }
        return p;
    }
}