package com.qianyu.testcollection02;

import java.util.ArrayList;

/**
 * @Auther: qianyu
 * @Date: 2026/10/25 - 10 - 25 - 11:01
 * @Description: com.qianyu.testcollection02
 * @version: 1.0
 */
public class Test03 {
    public void a(ArrayList<?> e){
        System.out.println("abc");
    }

    static void main(String[] args) {
        Test03 t = new Test03();
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Integer>());
    }
}
