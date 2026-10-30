package com.qianyu.testcollection04;

import java.util.Comparator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/29 - 10 - 29 - 10:57
 * @Description: com.qianyu.testcollection04
 * @version: 1.0
 */
public class BiJiaoHeight implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getHeight(),o2.getHeight());
    }
}
