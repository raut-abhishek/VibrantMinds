// package home-work.5-13-2026;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElemInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int n = 30;
        removeElement(arr, n);

    }

    public static void removeElement(int[] arr, int elem) {
        System.out.println("Array before removing element: " + Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elem) {
                list.add(arr[i]);
            }
        }
        System.out.println("Array after removing " + elem + " : " + list);
    }

}
