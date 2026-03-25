import java.util.Arrays;
public class AddLengthToLast {
    
    static int[] addNoToLast(int[] a){

        for(int i = 0; i < a.length; i++){
            int temp = a[i], count = 0;
            while(temp !=0 ){
                count++;
                temp/=10;
            }
            if(count<10) a[i] *= 10;
            else a[i] *= 100;
            a[i] += count;
        }
        return a;
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,80,90,100, 110,120};
        System.out.println(Arrays.toString(addNoToLast(arr)));
    }
}