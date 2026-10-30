package com.qianyu.testcollection;

/**
 * @Auther: qianyu
 * @Date: 2026/10/26 - 10 - 26 - 11:05
 * @Description: com.qianyu.testcollection
 * @version: 1.0
 */
public class MyLinkedlist {
    Node first;
    Node last;
    int count = 0;

    public MyLinkedlist() {

    }

    public void add(Object obj) {
        if (first == null) {
            Node n = new Node();
            first = n;
            last = n;
            n.setPre(null);
            n.setObj(obj);
            n.setNext(null);
        } else {
            Node n = new Node();
            n.setPre(last);
            last.setNext(n);
            n.setObj(obj);
            n.setNext(null);
            last = n;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public void get(int num) {
        Node n = first;
        for (int i = 0; i < num; i++) {
            n = n.getNext();
        }
        System.out.println(n.getObj());
    }

    public void tostring(MyLinkedlist ml) {
        Node n = first;
        for (int i = 0; i < ml.size(); i++) {
            System.out.print(n.getObj() + "  ");
            n = n.getNext();
        }
    }
}
    class Demo{
        static void main(String[] args) {
            MyLinkedlist ml = new MyLinkedlist();
            ml.add("aaa");
            ml.add("bbb");
            ml.add("ccc");
            System.out.println(ml.size());
            ml.get(2);
            ml.tostring(ml);
        }
    }
