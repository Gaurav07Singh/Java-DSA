package kunalwstDSA.array_Assignment;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {

        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for(int i =0 ; i<nums.length ;i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}
