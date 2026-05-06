
public class Writing implements Runnable {
    public void bookkWriting() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Book writing processing...");
        }
    }

    public void run() {
        bookkWriting();
    }
}
