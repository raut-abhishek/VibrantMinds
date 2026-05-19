import java.util.Comparator;

public class StudentByNameDESC implements Comparator<Student1> {

    public int compare(Student1 o1, Student1 o2) {
        return o2.getName().compareTo(o1.getName());
    }

}
