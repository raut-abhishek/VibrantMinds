import java.util.*;

public class AddSumToLast {

    static int[] sumToLast(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i], sum = 0, multiFactor = 1;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum < 10)
                a[i] *= 10;
            else
                a[i] *= 100;
            a[i] += sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 67, 343, 76, 34, 78, 53, 83, 68 };
        System.out.println(Arrays.toString(sumToLast(arr)));
    }
}
