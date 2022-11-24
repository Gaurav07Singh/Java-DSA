package kunalwstDSA.Java_Bootcamp;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        int[] arr ={403,8,55,2,62,3,99,65,41,2500};
        int[] ans = new int[arr.length];
        for(int i = 0 ; i<arr.length;i++) {
            int temp = arr[i];
            int sum = 0;
            while(temp >0) {
                int rem = temp %10;
                sum= sum+rem;
                temp /=10;
            }
            for(int j:ans) {
                ans[i]=sum;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
