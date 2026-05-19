import java.util.Comparator;

public class StudentByPercentageASC implements Comparator<Student1> {

    public int compare(Student1 o1, Student1 o2) {
        return Double.compare(o1.getPercentage(), o2.getPercentage());
    }

}
