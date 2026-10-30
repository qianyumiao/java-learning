package com.qianyu.testpizza;

import java.util.Scanner;

/**
 * 程序入口：模拟在披萨店点单。
 *
 * @author qianyu
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("你来到了一个披萨店中，想要处理一下你那咕咕叫的肚子。。。");
        System.out.println("这个店中的水果披萨和培根披萨好评如潮，你决定在这两个之中抉择。");
        System.out.println("请选择：1.水果披萨  2.培根披萨");

        // 全程序只创建一个 Scanner，并随程序结束关闭
        try (Scanner scanner = new Scanner(System.in)) {
            String name;
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    name = "水果披萨";
                } else if (choice == 2) {
                    name = "培根披萨";
                } else {
                    name = null;
                }
            } else {
                name = null;
                scanner.next();
            }

            if (name == null) {
                System.out.println("您录入信息有误，请重试！");
                return;
            }

            Pizza pizza = PizzaMaker.make(name, scanner);
            if (pizza == null) {
                System.out.println("下单失败，请重试！");
                return;
            }
            pizza.showPizza();
        }
    }
}
