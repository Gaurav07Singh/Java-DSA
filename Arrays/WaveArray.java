package kunalwstDSA.arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        waveArr(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void waveArr(int[] arr) {
        for(int i = 0 ; i<arr.length-1 ; i+=2) {
            if(i != arr.length-1) {
                swap(arr,arr[i] , arr[i+1]);
            }
        }
    }
    static void swap(int[] arr , int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
