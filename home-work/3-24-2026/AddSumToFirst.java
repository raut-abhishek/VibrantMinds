import java.util.*;

public class AddSumToFirst {

    static int[] addSum(int[] a){
        for(int i = 0; i<a.length; i++){
            int temp = a[i], sum = 0, multiFactor = 1;
            while(temp!=0){
                sum += temp%10;
                multiFactor *= 10;
                temp/=10;
            }
            sum *= multiFactor;
            a[i] = sum + a[i];
        }
        return a;
    }


    public static void main(String[] args) {
        int[] arr = {23,45,67,343,76,34,78,53,83,68};
        System.out.println(Arrays.toString(addSum(arr)));
    }
}
