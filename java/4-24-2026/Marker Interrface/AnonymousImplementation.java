// Anonymous implementation of an interface 
//  pre-requisit for functional interface


interface Demo{
    void m1();
}

public class AnonymousImplementation{
    public static void main(String[] args) {
        Demo d1 = new Demo() {
            public void m1(){
                System.out.println("m1 method of d1");
            }
        };

        Demo d2 = new Demo(){
            public void m1(){
                System.out.println("m1 method of d2");
            }
        };
        d1.m1();
        d2.m1();
    }
}