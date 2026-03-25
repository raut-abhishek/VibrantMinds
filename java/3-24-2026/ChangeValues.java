
// package java.3-24-2026;
import java.util.Arrays;

// case :-
// consider black number which is divisible by 3.
// consider white number which is divisible by 4.
// consider gray number which is divisible by both.
// replace black with -1
// replace white with -2
// replace gray with -3

public class ChangeValues {

    static int[] modifyValues(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0 && a[i] % 3 == 0)
                a[i] = -3;

            else if (a[i] % 3 == 0)
                a[i] = -1;
                
            else if (a[i] % 4 == 0)
                a[i] = -2;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 33, 27, 12, 11, 55, 99, 44, 24 };
        System.out.println(Arrays.toString(modifyValues(arr)));
    }

}
