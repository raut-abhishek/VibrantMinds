public class CheckNumberAddition {

    public static boolean checkNumber(int num) {
        String str = String.valueOf(num);

        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += ch - '0';
        }

        return str.contains(String.valueOf(sum));
    }

    public static void main(String[] args) {
        int input = 5104;
        System.out.println(checkNumber(input));
    }
}