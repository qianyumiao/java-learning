package com.qianyu.testpizza;

/**
 * 培根披萨。
 *
 * @author qianyu
 * @version 1.0
 */
public class BaconPizza extends Pizza {
    /** 培根单价：元/克。 */
    public static final int PRICE_PER_GRAM = 2;
    /** 培根披萨起步价（含 0 克培根时的尺寸基础价），单位：元。 */
    public static final int BASE_PRICE = 60;

    private double weight;

    public BaconPizza() {
    }

    public BaconPizza(String name, int size, int price, double weight) {
        super(name, size, price);
        this.weight = weight;
    }

    /**
     * 按重量计算价格。
     *
     * @param weight 培根重量（克），必须大于 0
     * @return 总价
     * @throws IllegalArgumentException 重量不为正数时抛出
     */
    public static int calculatePrice(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("培根重量必须大于 0，当前为：" + weight);
        }
        return (int) (BASE_PRICE + PRICE_PER_GRAM * weight);
    }

    @Override
    public void showPizza() {
        super.showPizza();
        System.out.println("您加入了" + weight + "克的培根。");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
