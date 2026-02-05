
public class LetterTriangleEvenOdd {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--) {
                    if(j%2!=0){
                        System.out.print((char)(i+64));

                    }else{
                        System.out.print((char)(i+96));
                    }
                }
            } else {
                for (int j = i; j < (2 * n)  - 1; j++) {
                    System.out.print(" ");
                }   
                for (int j = i; j >= n ; j--) {
                    if(j%2!=0){
                        System.out.print((char)(((n*2)-i)+64));
                    }
                    else{
                        System.out.print((char)(((n*2)-i)+96));

                    }
                }                     
            }

            System.out.println();
        }
    }
}
