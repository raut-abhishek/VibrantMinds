import a.b.c.d.RAM;

class Laptop extends RAM{

    public void startLaptop(){
        assemble();
        System.out.println("Laptop started successfully");

    }

    public void assemble(){
        System.out.println("64GB RAM assembled successfully");
        startRAM();
    }
}


class Mobile extends RAM{

    public void  startMobile(){
        assemble();
        System.out.println("Mobile started successfully");
    }


    public void assemble(){
        System.out.println("64GB RAM assembled successfully");
        startRAM();
    }
}

public class AbstractionExample2 {

    public static void main(String[] args) {
        Laptop l = new Laptop();
        Mobile m = new Mobile();
        l.startLaptop();
        m.startMobile();
    }

}

