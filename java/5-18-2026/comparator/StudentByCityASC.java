import java.util.Comparator;

public class StudentByCityASC implements Comparator<Student1> {
    public int compare(Student1 o1, Student1 o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
