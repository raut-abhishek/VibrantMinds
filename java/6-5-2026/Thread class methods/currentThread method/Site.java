
public class Site {
    public void doReservation() {
        Thread currThread = Thread.currentThread();
        for (int i = 0; i <= 10; i++) {
            System.out.println(currThread + "\t Reservation processing...");
        }
    }
}
