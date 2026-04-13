public class PalindromeString2 {

    public static boolean isPalindrome(String s1) {
        s1 = s1.toLowerCase();

        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                s2.append(ch);
            }
        }

        String original = s2.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    public static void main(String[] args) {
        String s1 = "never odd or even";
        System.out.println(isPalindrome(s1) ? "String is palindrome" : "Not a palindrome");
    }
}