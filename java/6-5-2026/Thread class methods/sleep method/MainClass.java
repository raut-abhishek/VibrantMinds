// Thread class sleep() method

public class MainClass {
    public static void main(String[] args) {
        Reading r = new Reading();
        Writing w = new Writing();
        Listening l = new Listening();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(l);

        t1.start();
        t2.start();
        t3.start();

    }
}
