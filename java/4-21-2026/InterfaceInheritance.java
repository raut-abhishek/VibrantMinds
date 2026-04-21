// multi level inheritance of interfaces

interface Demo1 {
    void m1();

    void m3();
}

interface Demo2 {
    void m2();

    void m3();
}

class DemoClass implements Demo1, Demo2 {
    public void m1() {
        System.out.println("m1 method of DemoClass");
    }

    public void m2() {
        System.out.println("m2 method of DemoClass");
    }

    public void m3() {
        System.out.println("m3 method of DemoClass");
    }

}

public class InterfaceInheritance {
    public static void main(String[] args) {
        DemoClass d = new DemoClass();
        d.m1();
        d.m2();
        d.m3();
    }
}
