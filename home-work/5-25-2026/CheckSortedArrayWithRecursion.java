public class CheckSortedArrayWithRecursion {
    public static void main(String[] args) {
        int[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] unSorted = { 1, 2, 3, 4, 5, 68, 6, 9 };

        System.out.println(isSorted(unSorted, 0));
        System.out.println(isSorted(sorted, 0));

    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }
}