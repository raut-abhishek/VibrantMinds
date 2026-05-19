import java.util.Comparator;

public class StudentByPercentageDESC implements Comparator<Student1> {

    public int compare(Student1 o1, Student1 o2) {
        return Double.compare(o2.getPercentage(), o1.getPercentage());
    }

}
