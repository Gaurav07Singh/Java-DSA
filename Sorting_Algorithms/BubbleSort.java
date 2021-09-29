package kunalwstDSA.sortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {-856,45,22,0,63,2,226};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr) {
        boolean swaped;
        // tun thew steps n-1 times
        swaped = false;
        for(int i = 0 ; i<arr.length  ; i++) {
            // for each stem , max item will come at the last respective index
            for(int j = 1 ; j<arr.length - i ;j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] <arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop program

            if(!swaped) {
                break;
            }
        }
    }
}
