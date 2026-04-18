// Simple program demonstrating encapsulation. Initializing and getting data using setter and getter methods

class Student {
    private int id;
    private String name;
    private String city;
    private double percentage;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPercentage() {
        return percentage;
    }

}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(1);
        s.setName("Abhishek");
        s.setCity("Pune");
        s.setPercentage(80.60);

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getCity());
        System.out.println(s.getPercentage());

    }
}
