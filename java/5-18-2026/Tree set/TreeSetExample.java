import java.util.TreeSet;
import student.Student1;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Student1> t = new TreeSet<>();

        t.add(new Student1(60, "Abhishek", "Phaltan", 80.60));
        t.add(new Student1(26, "Manthan", "Nagpur", 85.20));
        t.add(new Student1(370, "Abhishek", "Parbhani", 80.60));
        t.add(new Student1(4560, "Omkar", "Sangli", 50.20));

        for (Student1 s : t) {
            System.out.println(s);
        }
    }
}
