package com.qianyu.testcollection;

import java.util.stream.Gatherer;

/**
 * @Auther: qianyu
 * @Date: 2026/10/25 - 10 - 25 - 9:10
 * @Description: com.qianyu.testcollection
 * @version: 1.0
 */
public class TestGeneric<E> {
    //<>里面是一个类型，现在不确定，但是他一定是引用数据类型
    int age;
    String name;
    E sex;

    public void a(E n){
    }
    public void b(E[] m){
    }
}

class subTestGeneric extends TestGeneric<Integer>{
    //指定父类泛型，那么子类就不需要再指定泛型了，可以直接使用
}

class subTestGeneric2<E> extends TestGeneric<E>{
    //如果父类不指定泛型，那么子类也会变成一个泛型类，那这个E的类型可以在创建子类对象的时候确定
}

class Demo2{
    static void main(String[] args) {
        subTestGeneric2<String> stg2 = new subTestGeneric2<>();
        stg2.a("abc");
        stg2.sex = "女";
    }
}

class Demo{
    public static void main(String[] args) {
        subTestGeneric stg1 = new subTestGeneric();
        stg1.a(19);
    }
}

class Test{
    static void main(String[] args) {
        //TestGeneric进行实例化
        //(1)实例化的时候不指定泛型:那么认为此泛型为object类型
        TestGeneric tg1 = new TestGeneric();
        tg1.a("abc");
        tg1.a(17);
        tg1.a(3.14);
        tg1.b(new String[]{"a","b","c"});

        //(2)实例化的时候指定泛型:
        TestGeneric<String> tg2 = new TestGeneric<>();
        tg2.sex = "男";
        tg2.a("abc");
        tg2.b(new String[]{"a","b","c"});
    }
}
