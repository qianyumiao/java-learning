package com.qianyu.testcollection03;

import java.util.HashSet;

/**
 * @Auther: qianyu
 * @Date: 2026/10/27 - 10 - 27 - 17:37
 * @Description: com.qianyu.testcollection03
 * @version: 1.0
 */
public class Test02set {
    static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("aa");
        hs.add("bb");
        hs.add("banana");
        hs.add("html");
        hs.add("aa");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
