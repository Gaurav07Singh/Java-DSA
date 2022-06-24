package kunalwstDSA.revision2;

import java.util.Arrays;

public class ArrayListRecur {
    public static void main(String[] args) {

        int[] arr = {2,5,89,1,3,2,88,7,9,44,5,6};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }
    static void bubbleSort(int[] arr , int n) {

        if(n == 1) {
            return;
        }
        for(int i = 0 ; i<n-1 ;i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            bubbleSort(arr,n-1);
        }
    }
    static void swap(int[] arr , int i , int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void selectionSort(int[] arr , int i , int n) {

        int min = i;

        for(int j = i+1 ; j<n ; j++) {
            if(arr[j] < arr[min]) {
                min = j;
            }
            swap(arr,min,j);
            if(i+1<n) {
                selectionSort(arr,i+1,n);
            }
        }

    }
}