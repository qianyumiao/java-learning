package com.qianyu.testdate;

import java.sql.Date;

/**
 * @Auther: qianyu
 * @Date: 2026/10/19 - 10 - 19 - 17:49
 * @Description: com.qianyu.testdate
 * @version: 1.0
 */
public class Test {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //java.sql.Date:
        Date d = new Date(1592055964263L);
        System.out.println(d);
        /*
        (1)java.sql.Date和java.util.Date的区别：
        java.util.Date：年月日  时分秒
        java.sql.Date：年月日
        (2)java.sql.Date和java.util.Date的联系：
        java.sql.Date(子类) extends java.util.Date （父类）
         */
        //java.sql.Date和java.util.Date相互转换：
        //【1】util--->sql:
        java.util.Date date = new Date(1592055964263L);//创建util.Date的对象
        //方式1：向下转型
        Date date1 = (Date) date;
        /*
        父类：Animal 子类：Dog
        Animal an = new Dog();
        Dog d = (Dog)an;
         */
        //方式2：利用构造器
        Date date2 = new Date(date.getTime());
        //【2】sql-->util:
        java.util.Date date3 = d;
        //[3]String--->sql.Date:
        Date date4 =  Date.valueOf("2019-3-8");
    }
}
