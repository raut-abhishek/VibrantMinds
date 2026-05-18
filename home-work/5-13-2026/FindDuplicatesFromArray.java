// package home-work.5-13-2026;

import java.util.HashMap;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 10, 20, 30 };
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        System.out.println("Duplicate elements:");

        for (Integer key : map.keySet()) {

            if (map.get(key) > 1) {

                System.out.println(key);
            }
        }
    }
}
