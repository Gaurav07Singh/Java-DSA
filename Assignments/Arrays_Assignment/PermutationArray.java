package kunalwstDSA.array_Assignment;

import java.util.Arrays;

public class PermutationArray {
    public static void main(String[] args) {
        // Build Array from Permutation

        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(permutationArray(arr)));

    }
    static int[] permutationArray(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
