package com.qianyu.testdate;

import java.sql.Date;

/**
 * @Auther: qianyu
 * @Date: 2026/10/19 - 10 - 19 - 10:51
 * @Description: com.qianyu.testdate
 * @version: 1.0
 */
public class Test01 {
    static void main(String[] args) {
        Date date1 = Date.valueOf("2026-10-19");
        System.out.println(date1);
        java.util.Date date2 = date1;
        System.out.println(date2);
        //util-->sql
        //1(向下转型）
        Date date3 = new Date(date1.getTime());
        System.out.println(date3);
    }
}
