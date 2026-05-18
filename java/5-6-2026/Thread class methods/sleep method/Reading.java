
public class Reading implements Runnable {
    public void bookReading() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Book reading processing...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

    public void run() {
        bookReading();
    }
}
