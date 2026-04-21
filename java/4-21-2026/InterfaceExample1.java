interface Demo1 {
    void m1();
}

interface Demo2 extends Demo1 {
    void m2();
}

class DemoClass implements Demo2 {
    public void m1() {
        System.out.println("m1 method of DemoClass");
    }

    public void m2() {
        System.out.println("m2 method of DemoClass");
    }

}

public class InterfaceExample1 {
    public static void main(String[] args) {
        DemoClass d = new DemoClass();
        d.m1();
        d.m2();
    }
}
