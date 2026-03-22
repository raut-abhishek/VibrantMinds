// package home-work.3-23-2026;

import java.util.Arrays;

public class MoveFirstToLast {

    static int[] moveToLast(int[] arr){
        for(int i = 0; i< arr.length - 1; i++){
            arr[i] += arr[i+1];
            arr[i+1] = arr[i] - arr[i+1];
            arr[i] = arr[i] - arr[i+1];
        }

        return arr;
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(moveToLast(arr)));
        
    }
}
