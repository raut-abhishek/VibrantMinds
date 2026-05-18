public class User implements Runnable {

    private Site site;

    public User() {
    }

    public User(Site site) {
        this.site = site;
    }

    public void run() {
        site.doReservation();
    }
}
