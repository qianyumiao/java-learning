package com.qianyu.testpizza;

import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/10/15 - 10 - 15 - 10:57
 * @Description: com.qianyu.testpizza
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        System.out.println("你来到了一个披萨店中，想要处理一下你那咕咕叫的肚子。。。");
        System.out.println("这个店中的水果披萨和培根披萨好评如潮，你决定在这两个之中抉择。");
        System.out.println("你选择了：1.水果披萨 2.培根披萨");
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        Pizza pizza = PizzaMaker.make(name);
        pizza.showPizza();
    }
}
