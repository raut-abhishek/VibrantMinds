
public class TwoStarTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= (n * 2) - 1; i++) {

            if (i <= n) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("*");
                }

            } else {
                for (int j = 1; j <= (2 * n) - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i - n + 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
