package kunalwstDSA.Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,99,6,3,566,312};

        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr , int n) {
        if(n == 1) {
            return;
        }
        for(int i = 0 ; i<n-1 ; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(arr,n-1);
        }
    }
}
