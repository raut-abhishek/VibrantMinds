import java.util.Arrays;

public class InsertionSort {

    static int[] insertSortArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
            
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 9, 3, 7, 1, 8, 2, 6, 10 };
        System.out.print(Arrays.toString(insertSortArray(arr)));
    }
}
