package kunalwstDSA.array_Assignment;

public class GoodPairs {
    public static void main(String[] args) {
        // Number of Good Pairs

        int[] arr = {0,1,5,0,1,6,9,6,5};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i<nums.length ; i++) {
            for(int j = 1 ; j<nums.length ;j++) {
                if(nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
