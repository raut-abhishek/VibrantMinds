// String java.io.BufferedReader.readLine() throws IOException
// we need to handle this IOException

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IOException1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter Value: ");
        int value = Integer.parseInt(br.readLine());
        System.out.println("Value: " + value);
    }
}