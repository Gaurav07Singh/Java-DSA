package kunalwstDSA.leetCode;

public class LT_11_MostWater {
    public static void main(String[] args) {

        int[] arr = {25,88,6,5,233,625,336,22,36};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;

        while(i<j){
            int min=Math.min(height[i],height[j]); //we will find the min of both height because that is the water level
            max=Math.max(max,min*(j-i)); //finding the amount of water
            if(height[i]<height[j]) i++; //if ith is smaller then increase i
            else j--; // if jth is smalller then decrease j
        }
        return max;
    }
}
