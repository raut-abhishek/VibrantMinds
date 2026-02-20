class Demo {

    long createNumber(long n) {

        long original = n;
        long sum = 0;


        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }


        long multiplier = 1;
        long temp = sum;

        do {
            multiplier *= 10;
            temp /= 10;
        } while (temp != 0);

        return original * multiplier + sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.createNumber(999999999999999999L));
    }
}