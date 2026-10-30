package com.qianyu.testcollection02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Auther: qianyu
 * @Date: 2026/10/25 - 10 - 25 - 10:51
 * @Description: com.qianyu.testcollection02
 * @version: 1.0
 */
public class Test02 {
    static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;
    }
}
