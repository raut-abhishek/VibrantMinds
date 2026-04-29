import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;
import a.b.c.d.e.Demo;

public class CommonCheckedExceptions {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException {
        System.out.println("Program Started");
        try {
            Class<?> c = Class.forName("a.b.c.d.e.Demo");
            Demo d = (Demo) c.getDeclaredConstructor().newInstance();
            d.display();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println(e);
        }
        System.out.println("Program Ended");
    }
}
