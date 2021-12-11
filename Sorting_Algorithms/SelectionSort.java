package kunalwstDSA.sorting_Algos;

import java.util.Arrays;

public class Prac1 {
    public static void main(String[] args) {

        int[] arr = {0,1,5,6,2,4,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selection(int[] arr) {
        for(int i = 0 ; i<arr.length ;i++) {
            // find the max item in array and swap with correct index.
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr , int start , int end) {
        int max = start;
        for(int i = start ; i<=end ; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
