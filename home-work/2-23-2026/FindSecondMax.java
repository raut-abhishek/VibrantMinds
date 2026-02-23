// 2786489    o/p = 7

class Demo {
    int SecondLargest(int n) {
        int max = 0, smax = 0, lastdigit;
        while (n != 0) {
            lastdigit = n % 10;
            if (lastdigit > max) {
                smax = max;
                max = lastdigit;
            }
            n /= 10;
        }
        return smax;
    }
}

public class FindSecondMax{
    public static void main(String[] args){
        Demo d1 = new Demo();
        System.out.println(d1.SecondLargest(123846));
    }
}

 