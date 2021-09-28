package kunalwstDSA.binary_search;

public class Ceiling {
    public static void main(String[] args) {

        // Cealing question .................

        int[] arr = {2,3,5,9,14,16,18};
       int ans =  binarySearchQ1(arr , 16);
        System.out.println(ans);
    }
    static int binarySearchQ1(int[] arr , int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = start+(end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;   // return end for Floor of a number Question .
    }
}


