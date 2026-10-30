package com.qianyu.testcollection04;

import java.util.Comparator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/29 - 10 - 29 - 10:31
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class BiJiaoName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
