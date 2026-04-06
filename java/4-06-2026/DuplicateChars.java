public class DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != ' ') {
                    count++;
                    arr[j] = '0';
                }
            }

            if (count > 1 && arr[i] != '0') {
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
}