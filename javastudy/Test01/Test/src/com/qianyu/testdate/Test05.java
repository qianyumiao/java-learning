package com.qianyu.testdate;

/**
 * @Auther: qianyu
 * @Date: 2026/10/20 - 10 - 20 - 16:03
 * @Description: com.qianyu.testdate
 * @version: 1.0
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @Auther: msb-zhaoss
 */
public class Test05 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //日期转换：
        //SimpleDateFormat(子类) extends DateFormat（父类是一个抽象类）
        //格式化的标准已经定义好了：
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String--->Date
        try {
            Date d = df.parse("2019-4-6 12:23:54");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date--->String
        String format = df.format(new Date());
        System.out.println(format);
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
    }
}
