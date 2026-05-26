public class Doctor {

    private int id;
    private String name;
    private String specialization;
    private int experience;
    private double fees;

    public Doctor setId(int id) {
        if (id > 0) this.id = id;
        else System.out.println("Invalid ID.");
        return this;  
    }

    public Doctor setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
        else System.out.println("Name cannot be empty.");
        return this;
    }

    public Doctor setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    public Doctor setExperience(int experience) {
        if (experience >= 0) this.experience = experience;
        else System.out.println("Experience cannot be negative.");
        return this;
    }

    public Doctor setFees(double fees) {
        if (fees >= 0) this.fees = fees;
        else System.out.println("Fees cannot be negative.");
        return this;
    }

    public void displayInfo() {
        System.out.println("------------------------------");
        System.out.println("ID             : " + id);
        System.out.println("Name           : Dr. " + name);
        System.out.println("Specialization : " + specialization);
        System.out.println("Experience     : " + experience + " years");
        System.out.println("Fees           : ₹" + fees);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        Doctor d1 = new Doctor();


        d1.setId(1)
          .setName("Aditya Mohite")
          .setSpecialization("Cardiologist")
          .setExperience(15)
          .setFees(800.0)
          .displayInfo();


        Doctor d2 = new Doctor();
        d2.setId(2).setName("Priya Mehta").setSpecialization("Dermatologist").setExperience(8).setFees(500.0);
        d2.displayInfo();


        System.out.println("After update:");
        d1.setExperience(16).setFees(1000.0).displayInfo();
    }
}