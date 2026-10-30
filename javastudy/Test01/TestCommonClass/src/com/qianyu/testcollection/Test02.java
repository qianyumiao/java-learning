package com.qianyu.testcollection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SequencedCollection;

/**
 * @Auther: qianyu
 * @Date: 2026/10/24 - 10 - 24 - 16:31
 * @Description: com.qianyu.testcollection
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //add
        list.add(11);
        list.add(18);
        list.add(6);
        System.out.println(list);
        //add(int index);
        list.add(2,66);
        System.out.println(list);
        //set(int index,Object o);
        list.set(2,77);
        System.out.println(list);
        //remove(int index)
        list.remove(2);
        System.out.println(list);
        //get(int index);
        Object o = list.get(0);
        System.out.println(o);
        System.out.println("---------------");
        //遍历：
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");
        }
        //
        System.out.println();
        for(Object o1:list) {
            System.out.print(o1 + "  ");
        }
        //
        System.out.println();
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+"  ");
        }
    }
}
