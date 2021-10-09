package kunalwstDSA.array_Assignment;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
   static int[] runningSum(int[] arr) {
        int sum = 0;
        int previous = 0;
        int[] ans = new int[arr.length];
        for(int i = 0 ;i<arr.length ; i++) {
            sum = previous + arr[i];
            ans[i] = sum;
            previous += arr[i];
        }
        return ans;
   }
}
