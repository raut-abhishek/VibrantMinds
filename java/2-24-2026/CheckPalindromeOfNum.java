class CheckPalindromeNum{
    boolean checkPalinfromeOrNot(int n){
        if(n<10){
            return true;
        }
        else{
            int sum = 0;
            int temp = n;
            while(temp!=0){
                sum*=10;
                sum+=temp%10;
                temp/=10;
            }
            return sum == n;
        }
    }
}


public class CheckPalindromeOfNum{
    public static void main(String[] args){
        CheckPalindromeNum num = new CheckPalindromeNum();
        System.out.print(num.checkPalinfromeOrNot(11211));
    }
}