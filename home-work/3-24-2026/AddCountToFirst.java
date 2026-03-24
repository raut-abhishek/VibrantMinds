import java.util.Arrays;

public class AddCountToFirst {

    static int[] addCount(int[] a){

        for(int i = 0; i < a.length; i++){
            int temp = a[i], multiFactor = 1;

            while(temp != 0){
                multiFactor *= 10;
                temp /= 10;
            }

            int sum = i * multiFactor + a[i];
            a[i] = sum;
        }
        return a;
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,80,90,100};
        System.out.println(Arrays.toString(addCount(arr)));
    }
}