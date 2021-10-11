package kunalwstDSA.arrays2D;

import java.util.Arrays;

public class SearchIn2DArrayII {
    public static void main(String[] args) {

        // Integers in each row are sorted in ascending from left to right.
        //Integers in each column are sorted in ascending from top to bottom.

        int[][] arr = {
                {1,2,3,4},
                {10,20,30,40},
                {11,22,33,44}
        };

        int target = 33;
        System.out.println(Arrays.toString(searchIn2D(arr,target)));
    }
    static int[]  searchIn2D(int[][] matrix , int target) {
        int r = 0;
        int c = matrix.length - 1;

        while(r<matrix.length && c >= 0) {
            if(matrix[r][c] == target) {
                return new int[]{r,c};
            }
            if(matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
