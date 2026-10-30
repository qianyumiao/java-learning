package com.qianyu.testdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/10/19 - 10 - 19 - 18:05
 * @Description: com.qianyu.testdate
 * @version: 1.0
 */
public class Test {
    //目标：输入年月日生成日历表。
    static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String datenow = df.format(LocalDate.now());
        System.out.println("现在日期：");
        System.out.println(datenow);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入日期：");
        int date = sc.nextInt();
        LocalDate wantdate = LocalDate.of(year,month,date);
        System.out.println("----------------------------------------------");
        System.out.print("日\t一\t二\t三\t四\t五\t六\n");
        rili(wantdate);

    }
    public static void rili (LocalDate date){
        int day = date.getDayOfMonth();
        LocalDate date2 = LocalDate.of(date.getYear(),date.getMonth(),1);
        DayOfWeek getday = date2.getDayOfWeek();
        int numofweek = getday.getValue();
        int count = numofweek;
        int j = 1;
        for (int i = 1; i <=count ; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <=date.lengthOfMonth() ; i++) {
            if(i==date.getDayOfMonth()){
                System.out.print(i+"*\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count%7==0){
                System.out.println();
            }
        }
    }
}
