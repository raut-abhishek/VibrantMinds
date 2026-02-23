
// 12345 o/p == 52341

class SwapNums{
    int SwapFstnNLastNum(int n){
        int lastdigit=n%10;
        int first=n;
        int count=1;
        while(first>10){
            count*=10;
            first/=10;
        }
        return lastdigit*count;

    }
}

public class SwapFstnNLast {
    public static void main(String args[]){
        int n=12345;
        SwapNums nums = new SwapNums();
        System.out.print(nums.SwapFstnNLastNum(n));

    }
}
