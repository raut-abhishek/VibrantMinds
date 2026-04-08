public class SumOfDigitsInString {

    public static int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String input = "welcome to 2026";
        System.out.println(sumDigits(input));
    }
}