package kunalwstDSA.array_Assignment;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {

        int[] arr = {2,8,61,3,55,96,2,8};
        int n = 2; // {2,55,8,96,61,2,3,8}
        System.out.println(Arrays.toString(shuffle(arr,n)));



    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j= 0;

        while(i < nums.length) {
            if(i%2 == 0) {
                ans[i] = nums[j];
                i++;
            } else {
                ans[i] = nums[j+n];
                i++;
                j++;
            }
        }
        return ans;
      }

}
