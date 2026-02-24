class Prime{
    boolean checkPrime(int n){
        boolean isPrime = false;
        if(n==0 || n==1) return isPrime;
        else{
            for(int i = 2; i<=n/2; i++){
                if(n%i==0){
                    isPrime = true;
                    break;
                }
            }
            return !isPrime;
        }
    }
}




public class CheckPrimeNumber {
    public static void main(String[] args) {
        Prime num = new Prime();
        System.out.println(num.checkPrime(7));
    }
}
