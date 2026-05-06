public class Writing implements Runnable {

    public void bookWriting() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Book writing processing...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void run() {
        bookWriting();
    }
}
