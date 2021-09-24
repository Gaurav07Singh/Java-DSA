package kunalwstDSA.binary_search;

public class OrderAgonsticBinary_S {
    public static void main(String[] args) {

        int[] arr = {-28,-25,-5,2,5,8,12,16,18,26,29,300,350};
        int target = 350;
        int ans = orderAgonsticBS(arr , target);
        System.out.println(ans);

    }

    static int orderAgonsticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // find whether the arrayis sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];




        while (start <= end) {
            // find the middle element

            //         int mid = (start + end) ; Might be possible (start + end) exeecds the range of Integer.
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
            }
            } else {
                if(target > arr[mid]) {
                    end = mid -1;
                } else if(target > arr[mid]) {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}