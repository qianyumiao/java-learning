package com.qianyu.test;

/**
 * @Auther: qianyu
 * @Date: 2026/10/11 - 10 - 11 - 17:32
 * @Description: com.qianyu.test
 * @version: 1.0
 */
public class Menu {
    int price1;
    int price2;
    int price3;
    int price4;
    int price5;
    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    public void setMenu(String name1,String name2,String name3,String name4,String name5,int price1,int price2,int price3,int price4,int price5){
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        this.price5 = price5;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
    }
    public void Menu(){
        String[] names = {this.name1,this.name2,this.name3,this.name4,this.name5};
        int[] price = {this.price1,this.price2,this.price3,this.price4,this.price5};
        System.out.println("餐厅的菜单包含：");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+names[i]+":"+price[i]+"元.");
            System.out.println();
        }

    }
}
