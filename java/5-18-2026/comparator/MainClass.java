
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        TreeSet<Student1> t = null;
        int choice = 1;
        switch (choice) {
            case 0:
                t = new TreeSet<>(new StudentByIdASC());
                break;
            
            case 1:
                t = new TreeSet<>(new StudentByIdDESC());
                break;

            case 2:
                t = new TreeSet<>(new StudentByNameASC());
                break;

            case 3:
                t = new TreeSet<>(new StudentByNameDESC());
                break;

            case 4:
                t = new TreeSet<>(new StudentByCityASC());
                break;

            case 5:
                t = new TreeSet<>(new StudentByCityDESC());
                break;

            case 6:
                t = new TreeSet<>(new StudentByPercentageASC());
                break;

            case 7:
                t = new TreeSet<>(new StudentByPercentageDESC());
                break;

            default:
                break;
        }


        t.add(new Student1(60, "Abhishek", "Phaltan", 80.60));
        t.add(new Student1(26, "Manthan", "Nagpur", 85.20));
        t.add(new Student1(370, "Abhishek", "Parbhani", 80.60));
        t.add(new Student1(4560, "Omkar", "Sangli", 50.20));

        for (Student1 s : t) {
            System.out.println(s);
        }
    }
}
