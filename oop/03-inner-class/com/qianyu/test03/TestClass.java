package com.qianyu.test03;

public class TestClass {
    int a = 10;
    static int b = 10;

    public void a() {
        System.out.println("这是外部类的a方法");
    }

    static public void c() {
        System.out.println("这是外部类的静态c方法");
    }

    class A {
        int a = 30;

        public void a() {
            System.out.println("这是非静态成员类的a方法");
        }

        public void method() {
            int a = 40;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(TestClass.this.a);
        }
    }

    static class B {
        public void method() {
            System.out.println(b);
            c();
        }
    }

    // 关键：局部类 a 只能在这个方法体内部被"命名"
    public Comparable b() {
        final int a = 20;
        class a implements Comparable {
            public void c() {
                System.out.println(a);
                System.out.println(TestClass.this.a);
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new a();   // 只能通过 Comparable（父类型）把它交给外部
    }
}
