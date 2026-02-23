
// 1234 so o/p == 2341

class Demo1{
    int fisrtToLastt(int n){
        int first = n;
        int count = 1;
        while (first > 10) {
            first /= 10;
            count *= 10;
        }
        return ((n - (first * count)) * 10) + first;

    }
}

public class FirstToLast {
    public static void main(String args[]) {
        Demo1 d1 = new Demo1();

        System.out.print(d1.fisrtToLastt(9345));

    }
}
