package com.qianyu.test03;

/**
 * @Auther: qianyu
 * @Date: 2026/10/14 - 10 - 14 - 17:18
 * @Description: com.qianyu.test03
 * @version: 1.0
 */
public class TestClass {
    int a = 10;
    static int b = 10;
    public void a(){
        System.out.println("这是外部类的a方法");
    }
    static public void c(){
        System.out.println("这是外部类的静态c方法");
    }
    class A{
        int a = 30;
        public void a(){
            System.out.println("这是非静态成员类的a方法");
        }
        public void method(){
            int a = 40;
            System.out.println(a);//40
            System.out.println(this.a);//30
            System.out.println(TestClass.this.a);//10
        }
    }
    static class B{
        public void method(){
            System.out.println(b);//10
            c();
        }
    }
    public Comparable b(){
       final int a = 20;
        class a implements Comparable{
            public void c(){
                System.out.println(a);//20
                System.out.println(TestClass.this.a);//10
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }return new a();
    }
}
    class Demo{
        static void main(String[] args) {
            TestClass to = new TestClass();
            TestClass.A h =to.new A();
            to.a();
            h.a();
            h.method();
            Comparable b = to.b();
        }
    }
