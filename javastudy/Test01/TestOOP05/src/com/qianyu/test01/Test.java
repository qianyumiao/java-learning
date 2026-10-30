package com.qianyu.test01;

/**
 * @Auther: qianyu
 * @Date: 2026/10/13 - 10 - 13 - 17:44
 * @Description: com.qianyu.test01
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Girl g = new Girl();
        Animals b = PetStore.buy("猫");
        Animals a = PetStore.buy("狗");
        g.play(a);
        g.play(b);
        Cat c = (Cat) b;
        c.roll();
        Dog d = (Dog) a;
        d.guard();
    }
}
