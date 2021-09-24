package kunalwstDSA.binary_search;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-28,-25,-5,2,5,8,12,16,18,26,29,300,350};
        int target = 350;
        int ans = binarySearch(arr , target);
        System.out.println(ans);


    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            // find the middle element

   //         int mid = (start + end) ; Might be possible (start + end) exeecds the range of Integer.
            int mid = start+(end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
