class ReverseNum{
    int ReverseGivenNum(int n){
        int sum = 0;
        while(n!=0){
            sum*=10;
            sum += n% 10;;
            n/=10;
        }
        return sum;
    }
}



public class ReverseNumber{
    public static void main(String[] args){
        ReverseNum nums = new ReverseNum();
        System.out.println(nums.ReverseGivenNum(12345));
    }
}