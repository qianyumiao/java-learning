package com.qianyu.test02;

/**
 * @Auther: qianyu
 * @Date: 2026/10/12 - 10 - 12 - 11:00
 * @Description: com.qianyu.test02
 * @version: 1.0
 */
public class Test {
    static void main(String[] args) {
        Boy boy = new Boy("小明",18,180.5);
        Girl girl = new Girl("莉莉",18,80.0);
        System.out.println(girl.toString());
        boy.love(girl);
        girl.love(boy);
        girl.m = new Mom();
        girl.m.chat();
    }
}
