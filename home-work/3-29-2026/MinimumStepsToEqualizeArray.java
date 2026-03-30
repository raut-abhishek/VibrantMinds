
public class MinimumStepsToEqualizeArray {

    static int getSteps(int[] a) {
        int steps = 0, sum = 0, average = 0;
        for (int n : a) {
            sum += n;
        }
        average = sum / a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != average) {
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 8, 2 };
        System.out.println(getSteps(arr));
    }
}