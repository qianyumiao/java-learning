package com.qianyu.testcollection04;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: qianyu
 * @Date: 2026/10/29 - 10 - 29 - 10:31
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class TestTreeMap {
    static void main(String[] args) {
        BiJiaoHeight bj1 = new BiJiaoHeight();
        Map<Student,Integer> map = new TreeMap<>(bj1);
        map.put(new Student(18,184.8,"alili"),4745);
        map.put(new Student(8,155.2,"hlili"),4259);
        map.put(new Student(19,192.6,"clili"),4982);
        map.put(new Student(16,166.6,"plili"),4648);
        map.put(new Student(18,165.7,"elili"),4684);
        System.out.println(map.size());
        System.out.println(map);
    }
}
