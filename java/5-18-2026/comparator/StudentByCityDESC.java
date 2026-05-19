import java.util.Comparator;

public class StudentByCityDESC implements Comparator<Student1> {

    public int compare(Student1 o1, Student1 o2) {
        return o2.getCity().compareTo(o1.getCity());
    }

}
