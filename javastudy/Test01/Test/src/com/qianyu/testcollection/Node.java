package com.qianyu.testcollection;

/**
 * @Auther: qianyu
 * @Date: 2026/10/26 - 10 - 26 - 11:05
 * @Description: com.qianyu.testcollection
 * @version: 1.0
 */
public class Node {
    private Node pre;
    private Object obj;
    private Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }
}
