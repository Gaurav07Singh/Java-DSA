package kunalwstDSA.Recursion.Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums , int low , int high) {
        if(low >= high) {
            return;
        }
        int start = low;
        int end= high;
        int m = start+(end-start)/2;
        int pivot = nums[m];
        while(start <= end) {

            // also a reason why if its already sorted it will not swap
            while(nums[start] <pivot) {
                start++;
            }
            while(nums[end] > pivot) {
                end--;
            }
            if(start <=end) {
                int temp= nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct , let's sort two halves.

        sort(nums,low,end);
        sort(nums,start,end);
    }
}
