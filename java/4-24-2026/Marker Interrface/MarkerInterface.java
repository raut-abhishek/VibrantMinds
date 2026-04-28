// Marker interface is an empty interface

interface Marker {

}

class DemoClass implements Marker {

    private void m1() {
        System.out.println("m1 method of DemoClass called");
    }

    public void checkType(Marker m) {
        if (m instanceof Marker) {
            DemoClass d = (DemoClass) m;
            d.m1();
        } else {
            throw new NullPointerException();
        }
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        DemoClass obj1 = new DemoClass();
        DemoClass obj2 = new DemoClass();

        obj1.checkType(obj2);
        obj1.checkType(null);

    }
}
