interface Demo1 {
    int a = 10, b = 20;

    default void m1() {
        System.out.println("m1 method of Demo1");
    }

    default void m3() {
        System.out.println("m3 method of Demo1");
    }
}

interface Demo2 {
    int a = 30, b = 40;

    default void m2() {
        System.out.println("m2 method of Demo2");
    }

    default void m3() {
        System.out.println("m3 method of Demo2");
    }
}

class DemoClass implements Demo1, Demo2 {
    public void m3() {
        System.out.println("m3 method of DemoClass");
        Demo1.super.m3();
        Demo2.super.m3();
        System.out.println("Demo1 a = " + Demo1.a + ", Demo2 b = " + Demo2.b);

    }
}

public class DefaultMethodInInterface {
    public static void main(String[] args) {
        DemoClass d = new DemoClass();
        d.m1();
        d.m2();
        d.m3();
    }
}
