package kunalwstDSA.leetCode;

import java.util.Arrays;
import java.util.EnumSet;

public class Majority_Element {
    public static void main(String[] args) {

        // 169 Majority Element.
        /*
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
         */
        int[] arr = {5,2,9,5,22,3,0,2,5,66,3,2,125,69,3332,22};
       // int[] ans = (majorityElement(arr));

    }
    public static int majorityElement(int[] nums) {

        int majorityElement=0;
        int count=0;
        for (int num:nums){
            if(count==0)
                majorityElement=num;
            if(majorityElement==num)
                count++;
            else
                count--;
        }
        return majorityElement;

    }
}
