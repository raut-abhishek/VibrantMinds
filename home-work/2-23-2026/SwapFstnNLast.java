
// 12345 o/p == 52341

class SwapNums {

    int SwapFstnNLastNum(int n) {

        int lastDigit = n % 10;
        int firstDigit = n;
        int digits = 0;
        int temp = n;
        
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int power = (int) Math.pow(10, digits - 1);
        firstDigit = n / power;
        int middle = (n % power) / 10;
        return (lastDigit * power) + (middle * 10) + firstDigit;
    }
}

public class SwapFstnNLast {
    public static void main(String args[]){
        int n=12345;
        SwapNums nums = new SwapNums();
        System.out.print(nums.SwapFstnNLastNum(n));

    }
}
