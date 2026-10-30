package com.qianyu.testcollection02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: qianyu
 * @Date: 2026/10/25 - 10 - 25 - 10:30
 * @Description: com.qianyu.testcollection02
 * @version: 1.0
 */
public class Test01 {
    static void main(String[] args) {
        String[] strarr = new String[9];
        Object[] objarr = new Object[10];
        objarr = strarr;

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        //list1 = list2;-----------报错，因为是并列关系，底层都是object
        //总结：A和B是子类父类关系，但是G<A>,G<B>并并非是子类父类关系

    }
}
