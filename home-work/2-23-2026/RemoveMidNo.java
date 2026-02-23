
// 12345 so o/p == 15

class Demo2 {
    int RemoveMidNum(int n) {
        int lastdigit = n % 10;
        while (n > 10) {
            n /= 10;
        }
        return ((n * 10) + lastdigit);
    }
}

public class RemoveMidNo {
    public static void main(String args[]) {
        Demo2 d1 = new Demo2();
        System.out.print(d1.RemoveMidNum(12330));
    }
}
