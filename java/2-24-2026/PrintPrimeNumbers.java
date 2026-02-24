class PrintPrime{
    boolean printNums(int n){
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

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        PrintPrime num = new PrintPrime();
        int a = 100;
        for(int i = 2; i<a; i++){
            if(num.printNums(i)){
                System.out.println(i);
            }
        }
    }
    
}
