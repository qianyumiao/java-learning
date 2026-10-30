package com.qianyu.testcollection04;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: qianyu
 * @Date: 2026/10/29 - 10 - 29 - 10:25
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class TestMap02 {
    static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("alili",14);
        map.put("blili",15);
        map.put("dlili",16);
        map.put("elili",18);
        map.put("dlili",15);
        System.out.println(map.size());
        System.out.println(map);
    }
}
