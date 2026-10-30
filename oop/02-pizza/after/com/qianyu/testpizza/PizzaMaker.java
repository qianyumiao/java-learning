package com.qianyu.testpizza;

import java.util.Scanner;

/**
 * 披萨工厂：根据披萨名称读取用户输入并创建披萨对象。
 *
 * @author qianyu
 * @version 1.0
 */
public final class PizzaMaker {
    /** 水果披萨价格表。 */
    public static final int MANGO_PRICE = 90;
    public static final int PINEAPPLE_PRICE = 95;
    public static final int DURIAN_PRICE = 120;

    private PizzaMaker() {
    }

    /**
     * 创建披萨。Scanner 由调用方传入，避免对 System.in 重复包装。
     *
     * @param name    披萨名称，只支持“水果披萨”和“培根披萨”
     * @param scanner 已连接到输入源的扫描器
     * @return 创建好的披萨；名称不合法或输入不合法时返回 null
     */
    public static Pizza make(String name, Scanner scanner) {
        if (name == null || scanner == null) {
            return null;
        }
        if ("水果披萨".equals(name)) {
            return makeFruitPizza(scanner);
        }
        if ("培根披萨".equals(name)) {
            return makeBaconPizza(scanner);
        }
        System.out.println("您录入信息有误，请重试！");
        return null;
    }

    private static Pizza makeFruitPizza(Scanner scanner) {
        int size = readPositiveInt(scanner, "请输入你想要的披萨的尺寸大小：");
        System.out.println("请输入你想要的水果：1.芒果  2.菠萝  3.榴莲");
        String fruit = scanner.next();
        int price;
        if ("芒果".equals(fruit)) {
            price = MANGO_PRICE;
        } else if ("菠萝".equals(fruit)) {
            price = PINEAPPLE_PRICE;
        } else if ("榴莲".equals(fruit)) {
            price = DURIAN_PRICE;
        } else {
            System.out.println("您录入信息有误，请重试！");
            return null;
        }
        return new FruitPizza("水果披萨", size, price, fruit);
    }

    private static Pizza makeBaconPizza(Scanner scanner) {
        int size = readPositiveInt(scanner, "请输入你想要的披萨的尺寸大小：");
        int weight = readPositiveInt(scanner, "请录入你想要的培根的重量（克）：");
        return new BaconPizza("培根披萨", size, BaconPizza.calculatePrice(weight), weight);
    }

    /**
     * 读取一个正整数，非法输入时提示并重新读取。
     */
    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > 0) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.println("输入不合法，请输入一个正整数！");
        }
    }
}
