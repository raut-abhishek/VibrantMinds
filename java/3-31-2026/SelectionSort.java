import java.util.Arrays;

public class SelectionSort {

    static int[] sortArray(int[] a){
        for(int i = 0; i<a.length; i++){
            int current = i;
            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[current]){
                    current = j;
                }
            }
            int temp = a[i];
            a[i] = a[current];
            a[current] = temp;
        }
        return a;
    }



    public static void main(String[] args) {
        int[] arr = {5,4,9,3,7,1,8,2,6,10};
        System.out.print(Arrays.toString(sortArray(arr)));
    }
}
