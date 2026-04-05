import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputMethod1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter A: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter B: ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("A + B: " + (a + b));
    }
}
