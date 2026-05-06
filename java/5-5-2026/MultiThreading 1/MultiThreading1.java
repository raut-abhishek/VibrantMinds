// Multi Threading using thread class

public class MultiThreading1{
    public static void main(String[] args) {

        Listening l = new Listening();
        Reading r = new Reading();
        Writing w = new Writing();

        l.start();
        r.start();
        w.start();

    }
}