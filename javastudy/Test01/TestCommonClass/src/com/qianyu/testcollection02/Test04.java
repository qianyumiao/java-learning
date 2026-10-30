package com.qianyu.testcollection02;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: qianyu
 * @Date: 2026/10/25 - 10 - 25 - 12:03
 * @Description: com.qianyu.testcollection02
 * @version: 1.0
 */
public class Test04 {
    static void main(String[] args) {
        /*
        LinkedList常用方法：
        增加 addFirst(E e) addLast(E e)
             offer(E e) offerFirst(E e) offerLast(E e)
        删除 poll()
            pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
            removeFirst() removeLast()
        修改
        查看 element()
             getFirst()  getLast()
             indexOf(Object o)   lastIndexOf(Object o)
             peek()
             peekFirst() peekLast()
        判断
         */
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("bbb");
        System.out.println(list);//可以添加重复数据

        list.addFirst("111");//addfirst
        list.addLast("000");//addlast
        System.out.println(list);

        list.offer("1111");//offer:添加到尾端
        System.out.println(list);
        list.offerFirst("ppp");//offerfirst
        list.offerLast("rrr");//offerlast
        System.out.println(list);

        System.out.println(list.poll());//poll:删除首元素
        System.out.println(list);
        System.out.println(list.pollFirst());//pollfirst:删除首元素
        System.out.println(list);
        System.out.println(list.pollLast());//polllast:删除尾元素
        System.out.println(list);

        list.removeFirst();//removefirst
        list.removeLast();//removelast
        System.out.println(list);

        System.out.println(list.peek());

//        list.clear();
//        System.out.println(list.poll());
//        System.out.println(list.removeFirst());

        System.out.println("-------------");
        //遍历
        //1.普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
        //2.增加for
        for (String s:list){
            System.out.print(s+"  ");
        }
        System.out.println();
        //3.迭代器
        Iterator<String> it = list.iterator();
       while(it.hasNext()){
          System.out.print(it.next()+"  ");
       }
        //4.比3好，节省了内存
//        for (Iterator<String> it = list.iterator();it.hasNext();) {
//            System.out.print(it.next()+"  ");
//        }
    }
}
