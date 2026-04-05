import java.util.*;

public class InputMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.print("A + B: " + (a + b));

        sc.close();
    }
}
