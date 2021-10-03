package kunalwstDSA.assignment3;

public class SumOfNNums {
    public static void main(String[] args) {

        // Sum Of N Numbers
        int[] nums = {22,56,15,99,52,63};
        System.out.println(sumOfN(nums));
    }
    static int sumOfN(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0 ; i< n ; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
