//  Multi Threading using Runnable interface

public class MultiThreading2 {
    public static void main(String[] args) {
        Writing w = new Writing();
        Reading r = new Reading();
        Listening l = new Listening();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(l);


        t1.start();
        t2.start();
        t3.start();
    }   
}
