package kunalwstDSA.Java_Bootcamp;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        // count 0s

        System.out.println(countZeroes(506000));


    }
    public static int countZeroes(int n) {
        int count = 0;
        while(n != 0) {
            int temp = n%10;
            if(temp == 0) {
                count++;
            }
            n /=10;
        }
        return count;
    }


}
