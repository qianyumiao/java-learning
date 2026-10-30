package com.qianyu.testcollection02;

import com.qianyu.testdate.Test;

/**
 * @Auther: qianyu
 * @Date: 2026/10/25 - 10 - 25 - 9:59
 * @Description: com.qianyu.testcollection
 * @version: 1.0
 */

//并非带泛型的方法就叫泛型方法，泛型方法的参数类型要与当前类的泛型无关。
public class TestGeneric02<E> {
    static void main(String[] args) {
    }
    //不是泛型方法
    public void a(E e){

    }
    //是泛型方法
    //T的类型在调用方法时确定
    public static  <T> void b(T t){

    }
}

class Demo{
    static void main(String[] args) {
        TestGeneric02<String> tg1 = new TestGeneric02<>();
        tg1.a("abc");
        tg1.b(19);
        tg1.b(111);
    }
}