package com.qianyu.testcollection02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Auther: qianyu
 * @Date: 2026/10/27 - 10 - 27 - 16:50
 * @Description: com.qianyu.testcollection02
 * @version: 1.0
 */
public class Test05 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        //在“cc”之后添加一个字符串“kk”：
        //Iterator it = list.iterator();解决不了，会同时对集合进行操作，出异常
        //采用ListIterator
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            if (it.next() == "cc"){
                it.add("kk");
            }
        }
        System.out.println(list);
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        //逆向遍历：
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
    }
}
