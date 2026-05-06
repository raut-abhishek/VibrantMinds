public class Listening implements Runnable {
    public void musicListening() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Music listening processing...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void run() {
        musicListening();
    }
}
