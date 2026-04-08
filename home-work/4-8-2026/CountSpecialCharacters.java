public class CountSpecialCharacters {

    public static int countSpecialChars(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                if (ch != ' ') {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello? are you there ?? i am fine,...";
        System.out.println(countSpecialChars(input));
    }
}