// Anonymous implementation of an interface 
//  pre-requisit for functional interface


interface Mobile {
    void sim();
}

public class AnonymousImplementation2 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile() {
            public void sim() {
                System.out.println("Sim from mobile m1");
            }
        };

        Mobile m2 = new Mobile() {
            public void sim() {
                System.out.println("Sim from mobile m2");
            }
        };

        m1.sim();
        m2.sim();
    }
}
