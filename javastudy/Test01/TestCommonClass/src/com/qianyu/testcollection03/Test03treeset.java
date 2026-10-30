package com.qianyu.testcollection03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther: qianyu
 * @Date: 2026/10/28 - 10 - 28 - 15:58
 * @Description: com.qianyu.testcollection03
 * @version: 1.0
 */
public class Test03treeset {
    static void main(String[] args) {
        //使用内部比较器
        Comparator com = new BiJiao();
        TreeSet<Integer> t = new TreeSet<>();
        t.add(80);
        t.add(40);
        t.add(13);
        t.add(8);
        t.add(40);
        System.out.println(t);

        TreeSet<String> t2 = new TreeSet<>();
        t2.add("alili");
        t2.add("clili");
        t2.add("glili");
        t2.add("tlili");
        t2.add("blili");
        t2.add("clili");
        System.out.println(t2.size());
        System.out.println(t2);
        //使用外部比较器,一旦指定外部比较器，那么就会按照外部比较器进行比较。
        TreeSet<Student> t3 = new TreeSet<>(com);
        t3.add(new Student(17,"alili"));
        t3.add(new Student(14,"glili"));
        t3.add(new Student(18,"rlili"));
        t3.add(new Student(13,"blili"));
        t3.add(new Student(16,"elili"));
        t3.add(new Student(17,"glili"));
        System.out.println(t3.size());
        System.out.println(t3);
    }
}
