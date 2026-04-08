public class PalindromeString {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "never odd or even";

        if (isPalindrome(input)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}