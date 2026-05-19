import java.util.Comparator;

public class StudentByIdDESC implements Comparator<Student1>{
    public int compare(Student1 o1, Student1 o2){
        if(o1.getId()>o2.getId()){
            return -1;
        }
        else if(o1.getId()<o2.getId()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
