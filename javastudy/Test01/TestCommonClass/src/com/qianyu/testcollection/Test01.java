package com.qianyu.testcollection;

import java.util.*;

/**
 * @Auther: qianyu
 * @Date: 2026/10/22 - 10 - 22 - 17:56
 * @Description: com.qianyu.testcollection
 * @version: 1.0
 */
public class Test01 {
    static void main(String[] args) {
        Collection col = new ArrayList();
        //集合只能存放引用数据类型的数据
        //依旧自动装箱：int-->integer
        //添加元素：add
        col.add(18);
        col.add(11);
        col.add(910);
        System.out.println(col);
        //Array.asList,创建集合，用List接收
        List list = Arrays.asList(new Integer[]{11,15,79});
        //将另一个集合添加进col中addAll
        col.addAll(list);
        System.out.println(col);
        //清空元素clear
//        col.clear();
        //查看现在的元素个数验证:size()
        System.out.println("集合的元素数量");
        System.out.println(col.size());
        System.out.println("集合是否为空");
        System.out.println(col.isEmpty());
        //删除元素：remove，返回的是boolean类型的数
        boolean isRemove = col.remove(18);
        System.out.println(col);
        System.out.println("集合中数据是否被删除："+isRemove);
        Collection col2 = Arrays.asList(col.toArray());
        System.out.println(col2);
        System.out.println("两个集合是否相等？");
        System.out.println(col.equals(col2));
        //查看集合中是否包含某个数：contain
        System.out.println("集合中是否包含910？"+col.contains(910));
        System.out.println("集合中是否包含91？"+col.contains(91));
        System.out.println("------------------------------");


        //遍历
        //1.普通for循环,不行找不到索引
//        for (int i = 0; i < col.size(); i++) {
//            System.out.println();
//        }

        //2.增强for循环,用object接收是因为集合中可能含有不同类型的数据，object可以全部接收
        for (Object o:col){
            System.out.print(o+"  ");
        }

        System.out.println();
        
        //3.iterator
        Iterator it = col.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"  ");
        }
    }
}
