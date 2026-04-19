// Method chaining
class Laptop {
    private String brand;
    private int ram;
    private int price;

    public Laptop setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Laptop setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Laptop setPrice(int price) {
        this.price = price;
        return this;
    }

    public void show() {
        System.out.println(brand + " | RAM: " + ram + "GB | Price: " + price);
    }
}

public class MethodChain3 {
    public static void main(String[] args) {
        new Laptop()
            .setBrand("ASUS")
            .setRam(8)
            .setPrice(47000)
            .show();
    }
}