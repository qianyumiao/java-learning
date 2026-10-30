package com.qianyu.testcollection03;

import java.util.HashSet;

/**
 * @Auther: qianyu
 * @Date: 2026/10/27 - 10 - 27 - 17:16
 * @Description: com.qianyu.testcollection03
 * @version: 1.0
 */
public class Test01set {
    static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(13);
        hs.add(78);
        hs.add(91);
        hs.add(13);
        hs.add(0);
        System.out.println(hs.size());
        System.out.println(hs);//得到验证：唯一且无序

    }
}
