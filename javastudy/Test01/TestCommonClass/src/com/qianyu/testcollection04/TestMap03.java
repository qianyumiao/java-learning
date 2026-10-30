package com.qianyu.testcollection04;

import java.util.HashMap;

/**
 * @Auther: qianyu
 * @Date: 2026/10/29 - 10 - 29 - 10:59
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class TestMap03 {
    static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(19,"elili");
        hm.put(17,"glili");
        hm.put(16,"rlili");
        hm.put(14,"nlili");
        hm.put(17,"nlili");
        System.out.println(hm);
    }
}
