package kunalwstDSA.searching_Algo;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arb = {25,44,58,63,122,56,23,5};
        int b = 63;
        System.out.println(linearSearch(arb , b));


    }
    // search in array :return the index if item found
    // if not found return -1
    static int linearSearch(int[] arr , int num) {
        if(arr.length == 0) {
            return -1;
        }
        // run for loop

        for(int i= 0 ; i<arr.length ; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;

    }

    // search and return element
    static int linearSearch2(int[] arr , int num) {
        if(arr.length == 0) {
            return -1;
        }
        // run for loop

        for(int i= 0 ; i<arr.length ; i++) {
            if(arr[i] == num) {
                return num;
            }
        }
        return Integer.MAX_VALUE;

    }


    // search and return true/false .
    static boolean linearSearch3(int[] arr , int num) {
        if(arr.length == 0) {
            return false;
        }
        // run for loop

        for(int element : arr) {
            if(element == num) {
                return true;
            }
        }
        return false;

    }


}
