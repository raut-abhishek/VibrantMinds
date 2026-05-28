abstract class Aircraft {
    String name;

    Aircraft(String name) {
        this.name = name;
    }

    abstract void takeOff();
    abstract void land();
    abstract double ticketPrice();


    void displayInfo() {
        System.out.println(name + " | Ticket: ₹" + ticketPrice());
    }
}


class DomesticFlight extends Aircraft {
    DomesticFlight(String name) { super(name); }

    void takeOff() { System.out.println(name + " taking off domestically."); }
    void land()    { System.out.println(name + " landed at domestic airport."); }
    double ticketPrice() { return 4500; }
}


class InternationalFlight extends Aircraft {
    InternationalFlight(String name) { super(name); }

    void takeOff() { System.out.println(name + " taking off internationally."); }
    void land()    { System.out.println(name + " landed after immigration check."); }
    double ticketPrice() { return 35000; }
}

public class AirlineDemo {
    public static void main(String[] args) {

        Aircraft[] fleet = {
            new DomesticFlight("IndiGo 737"),
            new InternationalFlight("Air India A380")
        };

        for (Aircraft a : fleet) {
            a.displayInfo();
            a.takeOff();
            a.land();
            System.out.println();
        }
    }
}