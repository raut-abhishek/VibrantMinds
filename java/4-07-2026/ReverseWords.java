public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is powerful";
        String[] words = str.split(" ");

        String result = "";
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result += sb.reverse().toString() + " ";
        }

        System.out.println(result.trim());
    }
}