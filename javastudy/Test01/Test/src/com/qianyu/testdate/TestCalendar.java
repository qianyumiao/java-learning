package com.qianyu.testdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/10/19 - 10 - 19 - 18:05
 * @Description: com.qianyu.testdate
 * @version: 1.0
 */
public class TestCalendar {
    /** 每一列占的显示宽度，和表头保持一致 */
    private static final int W = 8;

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
        LocalDate wantdate = LocalDate.of(year, month, date);
        System.out.println("----------------------------------------------");
        // 表头也统一用 pad() 补齐，保证和下面的数字列宽完全一样
        String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        for (String w : weeks) {
            System.out.print(pad(w));
        }
        System.out.println();
        rili(wantdate);
    }

    public static void rili(LocalDate date) {
        // 取该月 1 号是星期几：MONDAY=1 ... SUNDAY=7
        // 第一列是星期日，所以偏移量 = getValue() % 7（星期日 -> 0，星期一 -> 1 ...）
        int offset = LocalDate.of(date.getYear(), date.getMonth(), 1)
                .getDayOfWeek().getValue() % 7;
        for (int i = 0; i < offset; i++) {
            System.out.print(pad(""));
        }
        int days = date.lengthOfMonth();
        for (int i = 1; i <= days; i++) {
            String cell = (i == date.getDayOfMonth()) ? i + "*" : String.valueOf(i);
            System.out.print(pad(cell));
            // 用“已占用的格子总数”判断换行，而不是用 count 取余
            if ((offset + i) % 7 == 0) {
                System.out.println();
            }
        }
        if ((offset + days) % 7 != 0) {
            System.out.println();
        }
    }

    /** 按“显示宽度”补空格：中文算 2 格，其它算 1 格 */
    private static String pad(String s) {
        return s + " ".repeat(W - displayWidth(s));
    }

    private static int displayWidth(String s) {
        int width = 0;
        for (char c : s.toCharArray()) {
            width += (c > 0x2E80) ? 2 : 1;
        }
        return width;
    }
}
