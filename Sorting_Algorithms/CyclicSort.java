package kunalwstDSA.sorting_Algos;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

    }
    static void swap(int[] ar , int first , int second) {
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;

    }
}
