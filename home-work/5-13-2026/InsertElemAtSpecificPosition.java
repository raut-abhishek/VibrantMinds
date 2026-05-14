// package home-work.5-13-2026;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElemAtSpecificPosition {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 80, 90 };
        int elem = 70;
        int position = 7;
        insertElement(arr, elem, position);
    }

    public static void insertElement(int arr[], int elem, int position) {
        System.out.println(
                "Array before inserting element '" + elem + "' at '" + position + "' position : "
                        + Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        while (index < arr.length) {
            if (index == position - 1) {
                list.add(elem);
            }
            list.add(arr[index]);
            index++;
        }
        System.out.println(
                "Array after inserting element '" + elem + "' at '" + position + "' position : " + list);
    }

}
