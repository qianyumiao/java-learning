package com.qianyu.test01;

import java.util.Objects;

/**
 * @Auther: qianyu
 * @Date: 2026/10/11 - 10 - 11 - 17:14
 * @Description: com.qianyu.test01
 * @version: 1.0
 */
public class Phone {
    double price;
    int year;
    String name;
    public Phone(String name,double price,int year){
        this.name = name;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Phone phone = (Phone) o;
//        return Double.compare(price, phone.price) == 0 && year == phone.year && Objects.equals(name, phone.name);
//    }
    public boolean equals(Object o){
        if(o instanceof Phone){
            Phone other = (Phone) o;
            if(this.name.equals(((Phone) o).name)&&this.year==((Phone) o).year&&this.price==((Phone) o).price){
                return true;
            }
        }return false;
      }
    @Override
    public int hashCode() {
        return Objects.hash(price, year, name);
    }
}
