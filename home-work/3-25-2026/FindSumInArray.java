import java.util.*;

public class FindSumInArray {

    static int[] findSum(int[] a, int target){
        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a.length; j++){
                if(a[i] + a[j] == target){
                    return new int[]{a[i], a[j]};
                }
            }
        }
        return new int[]{-1};
    }


    public static void main(String[] args) {
        int[] arr = {45,3,7,53,27,64,25,45,97,33,90};
        int sum = 18755;
        System.out.println(Arrays.toString(findSum(arr, sum)));
    }   
}
