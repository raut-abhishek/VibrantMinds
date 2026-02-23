
// 12345 so o/p = 51234

class ShiftNums{
    int shifDigit(int n){
        int count = 1;
        int lastdigit = n % 10;
        int add = n / 10;
        int num = n / 10;
        while (num > 0) {
            count *= 10;
            num /= 10;
        }
        return (lastdigit * count) + add;
    }
}

public class ShiftLastToFirst {
    public static void main(String args[]) {
        int n = 12345;
        ShiftNums nums = new ShiftNums();
        System.out.print(nums.shifDigit(n));

    }
}
