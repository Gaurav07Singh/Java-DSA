package kunalwstDSA.array_Assignment;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {

        //  How Many Numbers Are Smaller Than the Current Number
        int[] arr= {1,8,2,0,36,2,6,3,1};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j!=i && nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }
}

