import java.util.Comparator;

public class StudentByNameASC implements Comparator<Student1> {

    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
