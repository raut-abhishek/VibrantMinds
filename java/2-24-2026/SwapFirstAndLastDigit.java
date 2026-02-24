class Swap {

    int swapFirstAndLast(int n) {

        if (n < 10) return n;

        int last = n % 10;
        int first = n;
        int divisor = 1;

        while (first >= 10) {
            first /= 10;
            divisor *= 10;
        }

        int middle = (n % divisor) / 10;


        int newNum = last * divisor + middle * 10 + first;

        return newNum;
    }
}

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {

        Swap obj = new Swap();
        int n = 12345;

        System.out.println("After Swap: " + obj.swapFirstAndLast(n));
    }
}