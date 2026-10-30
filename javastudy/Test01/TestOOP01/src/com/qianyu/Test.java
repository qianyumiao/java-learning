package com.qianyu;

import java.lang.foreign.AddressLayout;

/**
 * @Auther: qianyu
 * @Date: 2026/10/6 - 10 - 06 - 15:44
 * @Description: com.qianyu
 * @version: 1.0
 */
public class Test {
    static void main() {
        //创建一个人类的具体对象
        //创建一个对象
        //Person属于引用数据类型
        //第一次加载类的时候，会进行类的加载，初始化创建对象的时候，对象的属性没有没有给赋值，有默认的初始化的值。
        Person qianyu = new Person();
        qianyu.name = "张三";
        qianyu.age = 18;
        qianyu.height = 174.9;
        qianyu.weight = 160.6;

        Person yy = new Person();
        yy.name = "李四";
        yy.age = 17;
        yy.weight = 120.1;
        yy.height = 165.0;

        //对属性值读取
        System.out.println(qianyu.name);
        System.out.println(yy.age);

        //对方法进行操作
        //不同的对象，属性有自己的特有的值，但方法都是通用的
        //属性：各个对象的属性是独立的
        //方法：各个对象的方法是共享的
        qianyu.eat();
        yy.eat();
        qianyu.sleep("教室");
        //String str = yy.introduce();
        //System.out.println(str);
        System.out.println(yy.introduce());
    }
}
