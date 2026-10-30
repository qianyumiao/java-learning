package com.qianyu.testoutercompare;

import java.util.Comparator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 14:38
 * @Description: com.qianyu.testoutercompare
 * @version: 1.0
 */
public class BiJiaoAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
