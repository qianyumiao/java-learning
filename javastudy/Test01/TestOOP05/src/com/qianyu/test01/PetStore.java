package com.qianyu.test01;

/**
 * @Auther: qianyu
 * @Date: 2026/10/13 - 10 - 13 - 17:28
 * @Description: com.qianyu.test01
 * @version: 1.0
 */
public class PetStore {
    public static Animals buy(String name){
        Animals a = null;
        if("猫".equals(name)){
            a = new Cat();
        }
        if("狗".equals(name)){
            a = new Dog();
        }
        return a;
    }
}
