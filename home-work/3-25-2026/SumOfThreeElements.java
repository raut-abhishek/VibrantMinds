import java.util.*;

public class SumOfThreeElements {

    static int[] findThreeSum(int[] a, int target){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                for(int k = j + 1; k < a.length; k++){
                    
                    if(a[i] + a[j] + a[k] == target){
                        return new int[]{a[i], a[j], a[k]};
                    }
                }
            }
        }
        return new int[]{}; // return empty if not found
    }

    public static void main(String[] args) {
        int[] arr = {45,3,7,53,27,64,25,45,97,33,90};
        int sum = 187;
        System.out.println(Arrays.toString(findThreeSum(arr, sum)));
    }
}