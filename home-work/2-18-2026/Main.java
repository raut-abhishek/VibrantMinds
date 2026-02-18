// class, object, instance variable, static variable, and local variable with JVM behavior

class Student {

    static String college = "ABC Engineering";

    
    int id;
    String name;

    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    void display() {
        
        String message = "Student Details:";
        
        System.out.println(message);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println();
    }

    
    static void changeCollege() {
        college = "XYZ University";
    }
}

public class Main {
    public static void main(String[] args) {

        
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Anita");

        s1.display();
        s2.display();

        
        Student.changeCollege();

        s1.display();
        s2.display();
    }
}
