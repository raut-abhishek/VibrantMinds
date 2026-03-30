import java.util.Arrays;

public class MedianOfTwoArrays {

    static double findMedian(int[] arr1, int[] arr2){
        int[] resultArr = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr1.length; i++){
            resultArr [i] = arr1[i];
        }
        for(int i = 0; i<arr2.length; i++){
            resultArr [arr1.length + i] = arr2[i];
        }
        Arrays.sort(resultArr);
        int n = resultArr.length;
        if(n%2==0){
            return (resultArr[n/2-1] + resultArr[n/2])/2.0;
        }
        else{
            return resultArr[n/2];
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(findMedian(arr1, arr2));
    }
}
