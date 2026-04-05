public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        // using loop
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);

        // using StringBuilder
        String str2 = "INDIA";
        String reversed2 = new StringBuilder(str2).reverse().toString();
        System.out.println(reversed2);
    }
}